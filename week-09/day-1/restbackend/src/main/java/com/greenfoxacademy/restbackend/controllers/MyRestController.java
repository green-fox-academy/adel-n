package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorResponse;
import com.greenfoxacademy.restbackend.models.Greeting;
import com.greenfoxacademy.restbackend.models.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {


  @GetMapping("/doubling")
  public Response doublingEndPoint(@RequestParam(value = "input", required = false) Integer received) {
    if(received == null) {
      return new ErrorResponse("Please provide an input!");
    }
    return new Doubling(received);
  }

  @GetMapping("/greeter")
  public Response greeterEndPoint(@RequestParam(value = "name", required = false) String name,
                                  @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorResponse("Please provide a name!");
    } else if (title == null) {
      return new ErrorResponse("Please provide a title!");
    } else if (name == null && title == null) {
      return new ErrorResponse("Please provide a name and a title!");
    } else {
      return new Greeting(name, title);
    }
  }
}
