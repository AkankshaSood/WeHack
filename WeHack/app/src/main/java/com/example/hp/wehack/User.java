package com.example.hp.wehack;

/**
 * Created by Akanksha on 10/4/2018.
 */

public class User {
    String id;
    String name;
    String lan;
    String email;
    String password;

    public User(String id,String name, String lan, String email, String password){
        this.id = id;
        this.name = name;
        this.lan = lan;
        this.email = email;
        this.password = password;
    }
}
