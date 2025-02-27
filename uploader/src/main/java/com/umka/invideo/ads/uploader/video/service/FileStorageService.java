package com.umka.invideo.ads.uploader.video.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mikhail Samsonov
 */
public interface FileStorageService {

  /**
   * Store original file to storage and return storage related path of video
   *
   * @param videoId    unique identifier of video record
   * @param sourceFile sent file
   * @return storage related path to original video
   */
  Optional<String> storeOriginalFile(UUID videoId, MultipartFile sourceFile);


}
