package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

  @Autowired
  LogService logService;

  @GetMapping("/doubling")
  public Object doublingEndPoint(@RequestParam(value = "input", required = false) Integer received) {
    if (received == null) {
      return new ErrorResponse("Please provide an input!");
    } else {
      String data = "input : " + received.toString();
      Log log = new Log("/doubling", data);
      logService.save(log);
      return new Doubling(received);
    }
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
      String data = "name : " + name + ", title : " + title;
      Log log = new Log("/greeter", data);
      logService.save(log);
      return new Greeting(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendEndPoint(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      String data = "Pathvariable : " + appendable;
      Log log = new Log("/appenda/" + appendable, data);
      logService.save(log);
      return new AppendA(appendable);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object dountilEndPoint(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) DoUntil doUntil) {
    if (doUntil == null) {
      return new ErrorResponse("Please provide a number!");
    } else if (what.equals("sum")) {
      String data = "Pathvariable : " + what + ", " + doUntil.getUntil();
      Log log = new Log("/dountil/" + what, data);
      logService.save(log);
      return new Sum(doUntil.getUntil());
    } else if (what.equals("factor")) {
      String data = "Pathvariable : " + what + ", " + doUntil.getUntil();
      Log log = new Log("/dountil/" + what, data);
      logService.save(log);
      return new Factor(doUntil.getUntil());
    } else {
      return new ErrorResponse("Please provide a number!");
    }
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) ArrayObject arrayObject) {
    if (arrayObject == null) {
      return new ErrorResponse("Please provide data!");
    } else if (arrayObject.getWhat() == null || arrayObject.getNumbers() == null) {
      return new ErrorResponse("Please provide what to do with the numbers!");
    } else if (arrayObject.getWhat().equals("sum")) {
      return new ArraySumMultiply(arrayObject.sum());
    } else if (arrayObject.getWhat().equals("multiply")) {
      return new ArraySumMultiply(arrayObject.multiply());
    } else if (arrayObject.getWhat().equals("double")) {
      return new ArrayDouble(arrayObject.doubleNumbers());
    } else {
      return "This is an invalid operation!";
    }
  }

  @GetMapping("/log")
  public Object logEndPoint() {
    
  }
}
