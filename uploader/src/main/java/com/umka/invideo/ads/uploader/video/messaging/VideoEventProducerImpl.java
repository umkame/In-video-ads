package com.umka.invideo.ads.uploader.video.messaging;

import com.umka.invideo.ads.uploader.data.messaging.IvaEvent;
import com.umka.invideo.ads.uploader.video.model.Video;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Mikhail Samsonov
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class VideoEventProducerImpl implements VideoEventProducer {

  @Value("${messaging.topic.sendVideo}")
  private String topic;

  private final KafkaTemplate<UUID, IvaEvent<?>> template;

  @Override
  public Video onVideoReceived(Video video) {
    template.send(topic, IvaEvent.ofMessage(video));
    return video;
  }
}
