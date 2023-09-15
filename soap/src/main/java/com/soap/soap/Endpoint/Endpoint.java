package com.soap.soap.Endpoint;

import com.soap.soap.Service.Service;
import com.techprimers.spring_boot_soap_example.GetUserRequest;
import com.techprimers.spring_boot_soap_example.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {

        @Autowired
        private Service service;


        @PayloadRoot(namespace = "http://techprimers.com/spring-boot-soap-example",
                localPart = "getUserRequest")
        @ResponsePayload
        public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
            GetUserResponse response = new GetUserResponse();
             response.setUser(service.getUsers(request.getName()));
            return response;
        }
    }