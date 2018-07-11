package com.kohls.symon.board.utils;

import com.kohls.symon.board.mongoentities.LEDBoardMongoEntity;
import com.kohls.symon.board.mongoentities.LEDOfficeMongoEntity;
import com.kohls.symon.board.model.LEDOffice;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LEDUtils {

    public static Map<String,Object> ledOfficeData(List<LEDOfficeMongoEntity> ledOfficeMongoEntities,List<LEDBoardMongoEntity> ledBoard) throws  Exception{
        Map<String,Object> ledData=new HashMap<>();
        List<LEDOffice> ledOffices=new ArrayList<>();
        List<LEDBoardMongoEntity> ledBoardWestData=new ArrayList<>();
        List<LEDBoardMongoEntity> ledBoardEASTData=new ArrayList<>();
        ledOfficeMongoEntities.forEach(ledOfficeMongoEntity -> {
            try {
                Field[] allFields =ledOfficeMongoEntity.getClass().getDeclaredFields();
                for (Field field :allFields) {
                    if(field.get(ledOfficeMongoEntity)!=null)
                    ledOffices.add(new LEDOffice(field.getName(),field.get(ledOfficeMongoEntity)));
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });
        setLEDBoardData(ledBoardWestData,ledBoardEASTData,ledBoard);
        ledData.put("ledOffice",ledOffices);
        ledData.put("LEDBoardWest",ledBoardWestData);
        ledData.put("LEDBoardEast",ledBoardEASTData);
        return  ledData;
    }
    private static void setLEDBoardData(List<LEDBoardMongoEntity> ledBoardWestData,List<LEDBoardMongoEntity> ledBoardEASTData,List<LEDBoardMongoEntity> ledBoard){
        ledBoard.forEach(ledBoardMongoEntity -> {
            if("west".equalsIgnoreCase(ledBoardMongoEntity.getLedLocation())){
                ledBoardWestData.add(ledBoardMongoEntity);
            }
            if ("east".equalsIgnoreCase(ledBoardMongoEntity.getLedLocation())){
                ledBoardEASTData.add(ledBoardMongoEntity);
            }
        });
    }

}
