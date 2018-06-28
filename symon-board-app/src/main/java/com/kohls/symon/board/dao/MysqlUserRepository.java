package com.kohls.symon.board.dao;

import com.kohls.symon.board.entities.OMOfficeBoardEntity;
import com.kohls.symon.board.entities.UserEntity;
import com.kohls.symon.board.entities.UserMyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlUserRepository extends CrudRepository<OMOfficeBoardEntity, String> {

}
