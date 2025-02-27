package com.umka.invideo.ads.uploader.controller.advice;

import com.umka.invideo.ads.uploader.data.CommonError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Mikhail Samsonov
 */
@Slf4j
@RestControllerAdvice
public class RestErrorHandler {

  @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(exception = Exception.class)
  public CommonError onException(Exception e) {
    log.error("Unchecked exception", e);
    return CommonError.builder().message(e.getMessage()).build();
  }

}
