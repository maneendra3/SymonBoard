package com.kohls.symon.board.dao;

import com.kohls.symon.board.entities.OMOfficeBoardEntity;
import com.kohls.symon.board.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,String> {
}
