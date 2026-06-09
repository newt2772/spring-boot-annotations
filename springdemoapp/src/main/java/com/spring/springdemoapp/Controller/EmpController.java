package com.spring.springdemoapp.Controller;

import com.spring.springdemoapp.DTO.EmpDTO;
import com.spring.springdemoapp.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/getEmp/{id}")
    public ResponseEntity<EmpDTO> getEmp(@PathVariable Integer id){
        EmpDTO employee = empService.getEmp(id);
        return ResponseEntity.ok(employee);
    }

}
