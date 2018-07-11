package com.kohls.symon.board.dao;

import com.kohls.symon.board.sqlentities.LEDBoardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LEDBoardRepository extends CrudRepository<LEDBoardEntity, String> {
}
