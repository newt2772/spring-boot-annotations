package com.spring.springdemoapp.Service;

import com.spring.springdemoapp.DTO.EmpDTO;
import com.spring.springdemoapp.Entity.Employee;
import com.spring.springdemoapp.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public EmpDTO getEmp(Integer id){
        //business ops
       Employee employee = empRepository.getEmp(id);
        return EmpDTO.empMapper(employee);
        //return employee;
    }

}
