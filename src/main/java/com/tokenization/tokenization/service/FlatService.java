package com.tokenization.tokenization.service;

import com.tokenization.tokenization.model.Flatdetails;
import com.tokenization.tokenization.repository.FlatdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatService {

    @Autowired
    private FlatdetailsRepository flatdetailsRepository;

    public List<Flatdetails> getAllFlats(){
        return flatdetailsRepository.findAll();
    }

    public Flatdetails saveFlatDetails(Flatdetails flatdetails){
        return flatdetailsRepository.save(flatdetails);
    }

    public String deleteFlatdetails(String id){
        flatdetailsRepository.deleteById(id);
        return "User deleted by ID:"+id;
    }

}
