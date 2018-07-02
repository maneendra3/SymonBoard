package com.kohls.symon.board.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LEDOffice {
    private String key;
    private Object value;

    public LEDOffice(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}



