package com.trendyol.springbootcouchbasecrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.IdAttribute;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class NotificationEntity {

  @IdAttribute
  private String id;
  @Field
  private String title;
  @Field
  private String description;
  @Field
  private Boolean read;


}
