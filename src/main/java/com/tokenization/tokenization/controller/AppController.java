package com.tokenization.tokenization.controller;

import com.tokenization.tokenization.model.Record;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/nodb/")
public class AppController {

    HashMap<Integer,Record> map = new HashMap<>();

    @GetMapping
    public HashMap<Integer,Record> getData(){
        return map;
    }

    @PostMapping("{id}")
    public boolean modData(@RequestBody Record record,@PathVariable int id){
       map.put(id,record);
       return true;
    }

}
