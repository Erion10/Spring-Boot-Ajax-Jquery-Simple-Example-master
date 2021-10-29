package com.solehin.model;

import org.hibernate.validator.constraints.NotBlank;

public class SearchCriteria {
    Long propertyId;
    int id;
    int value;

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }
}