package com.nicole.urlshortener;

import org.springframework.data.repository.CrudRepository;

//Manage UrlEntry table & @Id is String
public interface UrlRepository extends CrudRepository<UrlEntry, String> {

}
