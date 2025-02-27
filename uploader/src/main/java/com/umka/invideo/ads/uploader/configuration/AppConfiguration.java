package com.umka.invideo.ads.uploader.configuration;

import com.umka.invideo.ads.uploader.data.messaging.IvaEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

/**
 * @author Mikhail Samsonov
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.umka.invideo.ads.uploader.video.repository")
public class AppConfiguration {

//  @Bean
//  public ProducerFactory<UUID, IvaEvent<?>> producerFactory() {
//    Map<String, Object> configProps = new HashMap<>();
//    configProps.put(
//        ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
//        bootstrapAddress);
//    configProps.put(
//        ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
//        StringSerializer.class);
//    configProps.put(
//        ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
//        StringSerializer.class);
//    return new DefaultKafkaProducerFactory<>(configProps);
//    return new DefaultKafkaProducerFactory<>(new HashMap<>());
//  }
//
//  @Bean
//  public KafkaTemplate<UUID, IvaEvent<?>> kafkaTemplate() {
//    return new KafkaTemplate<>(producerFactory());
//  }

}
