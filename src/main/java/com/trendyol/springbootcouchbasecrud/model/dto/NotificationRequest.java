package com.trendyol.springbootcouchbasecrud.model.dto;

public class NotificationRequest {
  private String notificationTitle;
  private String notificationDesc;
  private Boolean read;

  public NotificationRequest() {
  }

  public NotificationRequest(String notificationTitle, String notificationDesc, Boolean read) {
    this.notificationTitle = notificationTitle;
    this.notificationDesc = notificationDesc;
    this.read = read;
  }

  public String getNotificationTitle() {
    return notificationTitle;
  }

  public void setNotificationTitle(String notificationTitle) {
    this.notificationTitle = notificationTitle;
  }

  public String getNotificationDesc() {
    return notificationDesc;
  }

  public void setNotificationDesc(String notificationDesc) {
    this.notificationDesc = notificationDesc;
  }

  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }
}
