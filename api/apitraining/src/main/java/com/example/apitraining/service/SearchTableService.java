package com.example.apitraining.service;

import com.example.apitraining.model.SearchTable;
import com.example.apitraining.repository.SearchTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchTableService {

    @Autowired
    private SearchTableRepository searchTableRepository;

    public List<SearchTable> getAllTables() {
        return searchTableRepository.findAll();
    }
}
