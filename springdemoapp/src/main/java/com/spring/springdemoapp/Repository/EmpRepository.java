package com.spring.springdemoapp.Repository;

import com.spring.springdemoapp.Entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

    public Employee getEmp(Integer id){
        //DB operation, fetch details from DB
        return new Employee(id, "help me", "DevOps", 22);
        //return "emp";
    }

}
