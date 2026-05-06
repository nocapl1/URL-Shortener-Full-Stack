package com.nicole.urlshortener;

import org.springframework.data.repository.CrudRepository;

//Manage UrlEntity table & @Id is String
public interface UrlRepository extends CrudRepository<UrlEntity, String> {

}
