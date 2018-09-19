package com.sample.reactive.AsyncServletService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AsyncServletServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AsyncServletServiceApplication.class, args);
  }

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }
}
