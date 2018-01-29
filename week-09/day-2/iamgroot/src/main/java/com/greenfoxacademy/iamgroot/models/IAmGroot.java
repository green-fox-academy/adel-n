package com.greenfoxacademy.iamgroot.models;

public class IAmGroot {

  private String received;
  private String translated;

  public IAmGroot() {
  }

  public IAmGroot(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
