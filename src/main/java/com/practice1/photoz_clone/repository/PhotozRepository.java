package com.practice1.photoz_clone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice1.photoz_clone.model.Photo;

@Repository
public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}