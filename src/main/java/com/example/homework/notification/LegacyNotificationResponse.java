package com.example.homework.notification;

import java.sql.Timestamp;

public class LegacyNotificationResponse {

  private long id;
  private String type;
  private String target;
  private String payload;
  private String status;
  private int failureCount;
  private int dispatchCount;
  private String blocked;
  private String message;
  private Timestamp createdAt;
  private Timestamp updatedAt;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getFailureCount() {
    return failureCount;
  }

  public void setFailureCount(int failureCount) {
    this.failureCount = failureCount;
  }

  public int getDispatchCount() {
    return dispatchCount;
  }

  public void setDispatchCount(int dispatchCount) {
    this.dispatchCount = dispatchCount;
  }

  public String getBlocked() {
    return blocked;
  }

  public void setBlocked(String blocked) {
    this.blocked = blocked;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}