package com.umka.invideo.ads.videoprocessing.processing;

/**
 * @author Mikhail Samsonov
 */
public interface Operation<R, A> {

  R process(A a);

}
