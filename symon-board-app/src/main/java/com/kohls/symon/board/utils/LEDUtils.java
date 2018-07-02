package com.kohls.symon.board.utils;

import com.kohls.symon.board.entities.LEDBoardMongoEntity;
import com.kohls.symon.board.entities.LEDOfficeMongoEntity;
import com.kohls.symon.board.model.LEDOffice;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LEDUtils {

    public static Map<String,Object> ledOfficeData(List<LEDOfficeMongoEntity> ledOfficeMongoEntities) throws  Exception{
        Map<String,Object> ledData=new HashMap<>();
        List<LEDOffice> ledOffices=new ArrayList<>();
        ledOfficeMongoEntities.forEach(ledOfficeMongoEntity -> {
            try {
                Field[] allFields =ledOfficeMongoEntity.getClass().getDeclaredFields();
                for (Field field :allFields) {
                    ledOffices.add(new LEDOffice(field.getName(),field.get(ledOfficeMongoEntity)));
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });
        ledData.put("ledOffice",ledOffices);
        return  ledData;
    }
}
