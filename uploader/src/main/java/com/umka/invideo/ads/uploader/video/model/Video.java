package com.umka.invideo.ads.uploader.video.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mikhail Samsonov
 */
@Data
@Builder
@Document("video")
@Accessors(chain = true)
public class Video {

  @Id
  private UUID id;
  private String path;
  private String originalFileName;
  private boolean sentToProcessing;

}
