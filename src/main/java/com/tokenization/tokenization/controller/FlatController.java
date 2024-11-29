package com.tokenization.tokenization.controller;

import com.tokenization.tokenization.model.Flatdetails;
import com.tokenization.tokenization.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flats")
public class FlatController {
    @Autowired
    private FlatService flatService;

    @GetMapping
    public List<Flatdetails> getDetails(){
        return flatService.getAllFlats();
    }

    @PostMapping
    public Flatdetails updateDetails(@RequestBody Flatdetails flatdetails){
        return flatService.saveFlatDetails(flatdetails);
    }

    @DeleteMapping
    public String deleteDetails(String id){
        return flatService.deleteFlatdetails(id);
    }
}
