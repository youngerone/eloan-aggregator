package com.younger.eloan.basice.domain;

import java.io.Serializable;


public class BaseDomain implements Serializable {

    protected Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
