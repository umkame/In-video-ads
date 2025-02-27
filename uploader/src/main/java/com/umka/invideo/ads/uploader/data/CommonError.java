package com.umka.invideo.ads.uploader.data;

import lombok.Builder;
import lombok.Value;

/**
 * @author Mikhail Samsonov
 */
@Value
@Builder
public class CommonError {

  String message;
}
