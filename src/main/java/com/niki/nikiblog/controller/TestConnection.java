package com.niki.nikiblog.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.ContextValue;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class TestConnection {

    @QueryMapping
    public String checkConnection(@ContextValue Map<String, List<String>> headers){
        System.out.println(headers);
        return "Connected";
    }


}
