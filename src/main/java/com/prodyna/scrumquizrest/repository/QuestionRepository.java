package com.prodyna.scrumquizrest.repository;

import com.prodyna.scrumquizrest.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "questions", path = "questions")
public interface QuestionRepository extends MongoRepository<Question, String> {
}
