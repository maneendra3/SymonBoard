package com.kohls.symon.board.dao;

import com.kohls.symon.board.sqlentities.LEDOfficeBoardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SQLLEDOfficeRepository extends CrudRepository<LEDOfficeBoardEntity, String> {

}
