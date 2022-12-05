package com.example.personal_system.entity;

import lombok.Data;

import java.util.List;

/**
 * @author :Double-Hong
 * @name :personal_system
 * @date :2022/11/26
 * @time :11:42
 **/
@Data
public class GenericityMessage<T> {
    private T t;
    private String message;

    public GenericityMessage(T t, String message) {
        this.t=t;
        this.message=message;
    }
}
