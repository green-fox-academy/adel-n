package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Log;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
  void save(Log log);
}
