package com.example.apitraining.service;
import com.example.apitraining.model.SearchColumn;
import com.example.apitraining.repository.SearchColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchColumnService {

    @Autowired
    private SearchColumnRepository searchColumnRepository;

    public List<SearchColumn> getAllColumns() {
        return searchColumnRepository.findAll();
    }

    public List<SearchColumn> findByLogicalNameAndPhysicalNameAndTableId(String logicalName, String physicalName, String tableId) {
        return searchColumnRepository.findByLogicalNameAndPhysicalNameAndSearchTable_Id(logicalName, physicalName, tableId);
    }
}
