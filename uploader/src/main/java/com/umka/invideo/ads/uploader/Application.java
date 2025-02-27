package com.umka.invideo.ads.uploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // XXX??
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
