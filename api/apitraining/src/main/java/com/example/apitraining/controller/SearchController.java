// SearchController.java
package com.example.apitraining.controller;

import com.example.apitraining.model.SearchColumn;
import com.example.apitraining.model.SearchTable;
import com.example.apitraining.service.SearchColumnService;
import com.example.apitraining.service.SearchTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SearchController {

    @Autowired
    private SearchTableService searchTableService;

    @Autowired
    private SearchColumnService searchColumnService;

    @GetMapping("/tables")
    public List<SearchTable> getAllTables() {
        return searchTableService.getAllTables();
    }

    @GetMapping("/columns")
    public List<SearchColumn> getAllColumns() {
        return searchColumnService.getAllColumns();
    }

    @PostMapping("/single-condition-retrieval")
    public List<SearchColumn> singleConditionRetrieval(@RequestBody Map<String, String> requestParams) {
        String logicalName = requestParams.get("logicalName");
        String physicalName = requestParams.get("physicalName");
        String tableId = requestParams.get("tableId");

        return searchColumnService.findByLogicalNameAndPhysicalNameAndTableId(logicalName, physicalName, tableId);
    }

    @PostMapping("/multiple-conditions-retrieval")
    public List<SearchColumn> multipleConditionsRetrieval(@RequestBody Map<String, String> requestParams) {
        String logicalName = requestParams.get("logicalName");
        String physicalName = requestParams.get("physicalName");
        String tableId = requestParams.get("tableId");

        return searchColumnService.findByLogicalNameAndPhysicalNameAndTableId(logicalName, physicalName, tableId);
    }

    
}

