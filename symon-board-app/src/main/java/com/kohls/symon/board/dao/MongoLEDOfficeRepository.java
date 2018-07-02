package com.kohls.symon.board.dao;

import com.kohls.symon.board.entities.LEDOfficeMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoLEDOfficeRepository extends MongoRepository<LEDOfficeMongoEntity,String> {

  /*  @Query(value="{}", fields="{ 'srtd' : 1,'occrtns':1,'avBufln':1,'srate1':1,'_id':0,'srate2':1,'ttl_RT':1,'compCht1':1,'compCht2':1,'avChts1':1,'avChts2':1,'blkChuts':1 }")
    public List<LEDOfficeMongoEntity> getAll();*/
}
