package com.umka.invideo.ads.uploader.video.repository;

import com.umka.invideo.ads.uploader.video.model.Video;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mikhail Samsonov
 */
public interface VideoRepository extends MongoRepository<Video, UUID> {

}
