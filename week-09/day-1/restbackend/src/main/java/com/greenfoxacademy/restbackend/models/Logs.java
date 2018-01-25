package com.greenfoxacademy.restbackend.models;

import java.util.List;

public class Logs {
  private List<Log> entryLogs;
  private int logCount;

  public Logs() {
  }

  public Logs(List<Log> entryLogs, int logCount) {
    this.entryLogs = entryLogs;
    this.logCount = logCount;
  }

  public List<Log> getEntryLogs() {
    return entryLogs;
  }

  public void setEntryLogs(List<Log> entryLogs) {
    this.entryLogs = entryLogs;
  }

  public int getLogCount() {
    return logCount;
  }

  public void setLogCount(int logCount) {
    this.logCount = logCount;
  }
}
