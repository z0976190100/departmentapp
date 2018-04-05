package com.persistense.entity;

import java.util.HashMap;
import java.util.Map;

public class DepartmentEntityImpl implements IEntity {


    final  String TABLE_NAME = "department1.department";
    final  String UNIQUE_TITLE = "title";

    public Map<String, String > coloumnValueMap = new HashMap<>();
    public long id;
    public String title; // as UniqueTitle
    public int empQuant;



    public DepartmentEntityImpl(){}

    public DepartmentEntityImpl(String title){
        this.title = title;
        this.coloumnValueMap.put("title", this.title);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmpQuant() {
        return empQuant;
    }

    public void setEmpQuant(int empQuant) {
        this.empQuant = empQuant;
    }

    @Override
    public String getTableName() {
        return this.TABLE_NAME;
    }

    @Override
    public String getUniqueTitle() {
        return this.UNIQUE_TITLE;
    }

    @Override
    public Map getColoumnValueMap() {
        return this.coloumnValueMap;
    }
}
