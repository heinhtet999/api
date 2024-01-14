package com.example.apitraining.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SearchTable {

    @Id
    private String id;
    private String logicalName;
    private String physicalName;


}
