package com.trendyol.springbootcouchbasecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
public class SpringBootCouchbaseCrudApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootCouchbaseCrudApplication.class, args);
  }

}
