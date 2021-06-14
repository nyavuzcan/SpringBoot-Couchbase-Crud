package com.trendyol.springbootcouchbasecrud.model.dto;

public class NotificationResponse {
  private String id;
  private String notificationTitle;
  private String notificationDesc;
  private Boolean read;


  public NotificationResponse() {
  }

  public NotificationResponse(String id, String notificationTitle, String notificationDesc, Boolean read) {
    this.id = id;
    this.notificationTitle = notificationTitle;
    this.notificationDesc = notificationDesc;
    this.read = read;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
