package com.greenfoxacademy.iamgroot.controllers;

import com.greenfoxacademy.iamgroot.models.ErrorResponse;
import com.greenfoxacademy.iamgroot.models.IAmGroot;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<ErrorResponse> grootEndPoint(@RequestParam(value = "received", required = false) String received) {
    if (received == null) {
      return new ResponseEntity<>(new ErrorResponse("I am Groot!"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>((MultiValueMap<String, String>) new IAmGroot(received, "I am Groot!"), HttpStatus.OK);
    }
  }
}
