package com.umka.invideo.ads.uploader.video.data.response;

import java.util.UUID;
import lombok.Builder;

/**
 * @author Mikhail Samsonov
 */
@Builder
public record UploadingResult(UUID fileId) {

  public static UploadingResult failed() {
    return null; // XXX:
  }
}
