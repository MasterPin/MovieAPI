package dev.masterpin.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//MontoRepo needs the object and the type of id object we will be dealing with
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
