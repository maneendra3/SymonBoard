package com.kohls.symon.board.dao;

import com.kohls.symon.board.mongoentities.LEDBoardMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoLEDBoardRepository extends MongoRepository<LEDBoardMongoEntity,String> {

    @Query("{ledLocation : ?0}")
    public List<LEDBoardMongoEntity> findAllByLedLocation(String ledLocation);
}
