package com.umka.invideo.ads.uploader.video.messaging;

import com.umka.invideo.ads.uploader.video.model.Video;

/**
 * @author Mikhail Samsonov
 */
public interface VideoEventProducer {

  Video onVideoReceived(Video video);

}
