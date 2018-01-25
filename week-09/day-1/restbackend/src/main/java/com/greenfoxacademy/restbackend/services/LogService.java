package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
  List<Log> getAllLogs();
  Log getLog(Integer id);
  void createLog(Log log);
  void setEndPoint(Integer id, String input);
  void setData(Integer id, String input);
  void deleteLog(Integer id);
}
