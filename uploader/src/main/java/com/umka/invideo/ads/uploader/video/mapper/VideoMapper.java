package com.umka.invideo.ads.uploader.video.mapper;

import com.umka.invideo.ads.uploader.video.data.response.UploadingResult;
import com.umka.invideo.ads.uploader.video.model.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Mikhail Samsonov
 */
@Mapper
public interface VideoMapper {

  @Mapping(target = "fileId", source = "id")
  UploadingResult mapToUploadingResult(Video video);

}
