package com.soap.soap.Service;


import com.techprimers.spring_boot_soap_example.User;
import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {


    private static final Map<String, User> users = new HashMap<>();
    @PostConstruct
    public void initialize(){

        User name = new User();
        name.setName("harika");
        name.setEmpId(24);
        name.setSalary(01234140);

        users.put(name.getName(), name);
    }

    public static User getUsers(String name){
        return users.get(name);
    }
}
