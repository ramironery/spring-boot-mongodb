package com.ramironery.restmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ramironery.restmongodb.domain.Post;
import com.ramironery.restmongodb.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
