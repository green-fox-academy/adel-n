package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Log;
import com.greenfoxacademy.restbackend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService{

  @Autowired
  LogRepository logRepository;

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }
}
