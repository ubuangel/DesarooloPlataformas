package com.makotojava.learn.hellospringboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@CrossOrigin(origins = "*")
//Access-Control-Allow-Origin:http://localhost:8080/hola
public class HelloRestController {
  @RequestMapping("/hola")
  public String hello() {
    return "Hello. All your base are belong to usnsorry solo es broma.";
  }
}