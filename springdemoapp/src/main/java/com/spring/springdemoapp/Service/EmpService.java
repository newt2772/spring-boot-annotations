package com.spring.springdemoapp.Service;

import com.spring.springdemoapp.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service //specilization of @Component(managed by Spring) fro business logic layer
public class EmpService {

    @Autowired
    EmpRepo empRepo;
    public String getEmp(){
        return empRepo.getEmp();
    }

}
