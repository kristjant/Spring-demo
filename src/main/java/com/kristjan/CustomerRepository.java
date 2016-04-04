package com.kristjan;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by kristjantalvar on 04/04/16.
 */
@RepositoryRestResource
public interface CustomerRepository extends MongoRepository<Customer, String> {

  @RestResource(path = "rrEesnimi")
  Customer findByEesnimi(@Param("eesnimi") String eesnimi);

  List<Customer> findByPerenimi(String perenimi);

  // SELECT * FROM customery WHERE eesnimi = ?;
  @Query("{ 'eesnimi' : ?0 }")
  Customer findByEesnimiWithQuery(String eesnimi);

}
