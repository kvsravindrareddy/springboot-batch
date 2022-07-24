package com.veera.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {
    @DBField(name = "id", isPrimaryKey = true, type = Long.class)
    private long id;
    @DBField(name = "name", type = String.class)
    private String name;
    @DBField(name = "email", type = String.class)
    private String email;
    @DBField(name = "created", type = Date.class)
    private Date created;
}