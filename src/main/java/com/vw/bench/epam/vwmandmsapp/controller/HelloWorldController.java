package com.vw.bench.epam.vwmandmsapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HelloWorldController {

  @RequestMapping("/helloworld/{name}")
  public String sayHello(@PathVariable("name") final String name) {
    return "Hello " + name + "!";
  }

  @RequestMapping("/helloworld")
  public ResponseEntity badRequest() {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Parameter {name} is unspecified");
  }

}
