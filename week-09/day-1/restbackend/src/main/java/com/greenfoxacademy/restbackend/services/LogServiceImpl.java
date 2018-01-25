package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Log;
import com.greenfoxacademy.restbackend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{

  @Autowired
  LogRepository logRepository;

  @Override
  public List<Log> getAllLogs() {
    List<Log> logs = new ArrayList<>();
    logRepository.findAll().forEach(logs::add);
    return logs;
  }

  @Override
  public Log getLog(Integer id) {
    return logRepository.findOne(id);
  }

  @Override
  public void createLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public void setEndPoint(Integer id, String input) {
    logRepository.findOne(id).setEndpoint(input);
  }

  @Override
  public void setData(Integer id, String input) {
    logRepository.findOne(id).setData(input);
  }

  @Override
  public void deleteLog(Integer id) {
    logRepository.delete(id);
  }
}
