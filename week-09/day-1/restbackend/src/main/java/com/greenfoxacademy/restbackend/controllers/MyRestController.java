package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {


  @GetMapping("/doubling")
  public Object doublingEndPoint(@RequestParam(value = "input", required = false) Integer received) {
    if(received == null) {
      return new ErrorResponse("Please provide an input!");
    }
    return new Doubling(received);
  }

  @GetMapping("/greeter")
  public Object greeterEndPoint(@RequestParam(value = "name", required = false) String name,
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

  @GetMapping("/appenda/{appendable}")
  public Object appendEndPoint(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      return new AppendA(appendable);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object dountilEndPoint(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) DoUntil doUntil) {

    if (doUntil == null) {
      return new ErrorResponse("Please provide a number!");
    } else if (what.equals("sum")) {
      return new Sum(doUntil.getUntil());
    } else if (what.equals("factor")) {
      return new Factor(doUntil.getUntil());
    } else {
      return new ErrorResponse("Please provide a number!");
    }
  }

/*  @PostMapping("/arrays")
  public Object arraysEndPoint()*/
}
