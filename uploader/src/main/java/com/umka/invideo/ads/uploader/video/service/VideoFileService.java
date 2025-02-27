package com.umka.invideo.ads.uploader.video.service;

import com.umka.invideo.ads.uploader.video.data.response.UploadingResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mikhail Samsonov
 */
public interface VideoFileService {

  UploadingResult saveFile(MultipartFile videoFileData);
}
