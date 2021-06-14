package com.trendyol.springbootcouchbasecrud.controller;

import com.trendyol.springbootcouchbasecrud.entity.NotificationEntity;
import com.trendyol.springbootcouchbasecrud.model.dto.NotificationRequest;
import com.trendyol.springbootcouchbasecrud.model.dto.NotificationResponse;
import com.trendyol.springbootcouchbasecrud.model.type.GenericResponse;
import com.trendyol.springbootcouchbasecrud.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/notifications")
public class AlertController {

/*  @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity saveNotification(@RequestBody NotificationRequest notificationRequest) {
    return new ResponseEntity(), HttpStatus.OK);
  }
*/

  @Autowired
  NotificationRepository notificationRepository;

  @GetMapping(value = "/getNotification/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
  public List<NotificationEntity> getNotification(@PathVariable Long id) {
    return notificationRepository.findAll();
  }

/*    @PutMapping(value = "/getNotification/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<NotificationResponse> readNotification(@PathVariable Long id) {
    return new ResponseEntity(), HttpStatus.OK);
  }*/

/*
  @DeleteMapping(value = "/deleteNotification/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<GenericResponse> deleteNotification(@PathVariable Long id) {
    return new ResponseEntity(), HttpStatus.OK);
  }
*/



}
