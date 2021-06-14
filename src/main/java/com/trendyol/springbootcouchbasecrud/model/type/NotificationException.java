package com.trendyol.springbootcouchbasecrud.model.type;

public class NotificationException extends RuntimeException{
  private String detailedMessage;

  public NotificationException(String message) {
    super(message);
  }

  public NotificationException(String message, String detailedMessage) {
    super(message);
    this.detailedMessage = detailedMessage;
  }

  public String getDetailedMessage() {
    return detailedMessage;
  }

  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
  }

  @Override
  public String toString() {
    return "NotificationException{" +
        "detailedMessage='" + detailedMessage + '\'' +
        ",message='" + this.getMessage() + '\'' +
        '}';
  }
}
