package com.example.apitraining.repository;

import com.example.apitraining.model.SearchColumn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchColumnRepository extends JpaRepository<SearchColumn, String> {
    List<SearchColumn> findByLogicalNameAndPhysicalNameAndSearchTable_Id(String logicalName, String physicalName, String tableId);
}
