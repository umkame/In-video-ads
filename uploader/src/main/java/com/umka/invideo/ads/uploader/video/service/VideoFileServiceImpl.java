package com.umka.invideo.ads.uploader.video.service;

import com.umka.invideo.ads.uploader.video.data.response.UploadingResult;
import com.umka.invideo.ads.uploader.video.mapper.VideoMapper;
import com.umka.invideo.ads.uploader.video.messaging.VideoEventProducer;
import com.umka.invideo.ads.uploader.video.model.Video;
import com.umka.invideo.ads.uploader.video.repository.VideoRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mikhail Samsonov
 */
@Service
@RequiredArgsConstructor
public class VideoFileServiceImpl implements VideoFileService {

  private final FileStorageService fileStorageService;
  private final VideoRepository repository;
  private final VideoEventProducer producer;
  private final VideoMapper mapper;

  @Override
  public UploadingResult saveFile(MultipartFile multipartFile) {
    UUID videoId = UUID.randomUUID();
    return fileStorageService.storeOriginalFile(videoId, multipartFile)
        .map(path -> buildVideo(videoId, multipartFile.getOriginalFilename(), path))
        .map(producer::onVideoReceived)
        .map(repository::save)
        .map(mapper::mapToUploadingResult)
        .orElseGet(UploadingResult::failed);
  }

  private Video buildVideo(UUID videoId, String fileName, String path) {
    return Video.builder().id(videoId).originalFileName(fileName).path(path).build();
  }
}
