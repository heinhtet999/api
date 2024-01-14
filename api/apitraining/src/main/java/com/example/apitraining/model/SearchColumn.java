package com.example.apitraining.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SearchColumn {

    @Id
    private String id;
    private String logicalName;
    private String physicalName;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private SearchTable searchTable;


}
