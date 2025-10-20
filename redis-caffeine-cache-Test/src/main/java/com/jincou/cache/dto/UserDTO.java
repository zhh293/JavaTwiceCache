package com.jincou.cache.dto;

import lombok.Data;

import java.io.Serializable;



@Data
public class UserDTO implements Serializable {

    public UserDTO() {

    }

    public UserDTO(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    private String name;
    private String addr;
    private long currTime = System.currentTimeMillis();
}
