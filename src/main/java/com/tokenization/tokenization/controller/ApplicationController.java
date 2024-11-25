package com.tokenization.tokenization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.StringTokenizer;

@RestController
public class ApplicationController {



    @GetMapping("get")
    public ArrayList<String> getData(){
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("my name is khan"," ");
        while (str.hasMoreTokens()) {
            list.add(str.nextToken());
//            System.out.println(str.nextToken());
        }
        return list;
    }
}
