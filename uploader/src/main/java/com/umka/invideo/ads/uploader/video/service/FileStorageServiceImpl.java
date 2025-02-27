package com.umka.invideo.ads.uploader.video.service;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mikhail Samsonov
 */
@Slf4j
@Service
public class FileStorageServiceImpl implements FileStorageService {

  @Value("${file.storage.basePath}")
  private Path storage;

  @Value("${file.storage.originalFile.name:original.video}")
  private String originalFileName;

  @Override
  public Optional<String> storeOriginalFile(UUID videoId, MultipartFile sourceFile) {
    try {
      Path resultDirectory = Files.createDirectories(storage.resolve(videoId.toString()));
      Path resultFile = Files.createFile(resultDirectory.resolve(originalFileName));
      try (OutputStream outputStream = Files.newOutputStream(resultFile)) {
        IOUtils.copyLarge(sourceFile.getInputStream(), outputStream);
        return Optional.of(resultFile.toString());
      }
    } catch (IOException ioe) {
      log.warn("Exception during file saving", ioe);
      return Optional.empty();
    }
  }

}
