package com.spring.springdemoapp.Repository;

import org.springframework.stereotype.Repository;

@Repository //DB class
public class EmpRepo {
    public String getEmp(){
        //DB operations - get emp from DB
        return "emp";
    }
}
