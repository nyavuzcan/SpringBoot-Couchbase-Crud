package com.trendyol.springbootcouchbasecrud.repository;

import com.trendyol.springbootcouchbasecrud.entity.NotificationEntity;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

public interface NotificationRepository extends CouchbaseRepository <NotificationEntity, String> {

}
