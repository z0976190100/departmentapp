package com.persistense.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeEntityImpl implements IEntity {

    final String TABLE_NAME = "department1.employee";
    final String UNIQUE_TITLE = "login";


    public long id;
    public String firstName;
    public String lastName;
    public long department;
    public String birthDate;
    public String login;
    public String pass;
    public Map<String, String> coloumnValueMap = new HashMap<>();

    public EmployeeEntityImpl() {
    }

    public EmployeeEntityImpl(String firstName, String lastName, long department, String login, String pass) {
        //this.id = id;
        this.firstName = firstName;
        this.coloumnValueMap.put("first_name", this.firstName);
        this.lastName = lastName;
        this.coloumnValueMap.put("last_name", this.lastName);
        /*this.birthDate = birthDate;
        this.coloumnValueMap.put("birth_date", this.birthDate);*/
        this.department = department;
        this.coloumnValueMap.put("department_id_long", Long.toString(this.department));
        this.login = login; // unique title
        this.coloumnValueMap.put("login", this.login);
        this.pass = pass;
        this.coloumnValueMap.put("pass", this.pass);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() { return birthDate; }

    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public long getDepartment() {
        return department;
    }

    public void setDepartment(long department) {
        this.department = department;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
