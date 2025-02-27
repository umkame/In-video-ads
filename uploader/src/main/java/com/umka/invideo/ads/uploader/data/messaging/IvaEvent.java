package com.umka.invideo.ads.uploader.data.messaging;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.Value;

/**
 * @author Mikhail Samsonov
 */
@Value
@RequiredArgsConstructor
public class IvaEvent<T> {

  UUID id = UUID.randomUUID();
  LocalDateTime dateCreated = LocalDateTime.now();
  T message;

  public static <T> IvaEvent<T> ofMessage(T t) {
    return new IvaEvent<T>(t);
  }
}
