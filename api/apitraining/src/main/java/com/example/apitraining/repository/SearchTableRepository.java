package com.example.apitraining.repository;

import com.example.apitraining.model.SearchTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchTableRepository extends JpaRepository<SearchTable, String> {

}
