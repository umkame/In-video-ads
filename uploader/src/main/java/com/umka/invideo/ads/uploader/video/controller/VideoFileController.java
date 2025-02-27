package com.umka.invideo.ads.uploader.video.controller;

import com.umka.invideo.ads.uploader.video.data.response.UploadingResult;
import com.umka.invideo.ads.uploader.video.service.VideoFileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mikhail Samsonov
 */
@RestController
@RequestMapping
@AllArgsConstructor
public class VideoFileController {

  private final VideoFileService videoFileService;

  @PostMapping("/upload")
  public UploadingResult upload(@RequestParam("file") MultipartFile sentFile) {
    return videoFileService.saveFile(sentFile);
  }

}
