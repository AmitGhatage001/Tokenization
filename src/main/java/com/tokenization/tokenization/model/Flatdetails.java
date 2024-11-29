package com.tokenization.tokenization.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "flatdetails")
public class Flatdetails {

    @Id
    private String id;
    private int flatNumber;
//    private List<OwnerDetail> ownerdetails;
    private OwnerDetail ownerdetails;
    private String sellingRate;
}
