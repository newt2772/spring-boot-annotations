package com.spring.springdemoapp.Controller;

import com.spring.springdemoapp.Entity.Employee;
import com.spring.springdemoapp.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //@Controller + @ResponseBody //only returns data no rendring of UI
public class EmpController {

    @Autowired
    EmpService empService;

    //@RequestMapping(path = "/getEmp", method = RequestMethod.GET)
    @GetMapping("/getEmp") //@RequestMapping specialized for GET
    //@ResponseBody
    public String getEmp(){
        return empService.getEmp();
    }

    @GetMapping("/getEmpById") //http://localhost:8080/getEmpById?empId=1
    public String getEmpById(@RequestParam Integer empId){ //accept whatever requestparam user passes
        return "emp";
    }

    @GetMapping("/getEmpByPathId/{empId}") //http://localhost:8080/getEmpById/1
    public String getEmpByPathId(@PathVariable Integer empId){ //accept whatever requestparam user passes
        return "emp";
    }

    @PostMapping("/addEmp")
    public String addEmp(@RequestBody Employee employee){ //maps whatever body user passes to obj
        return "added";
    }

    @PutMapping("/upEmp")
    public String upEmp(Employee employee){
        return "updated";
    }

    @DeleteMapping("/delEmp")
    public String delEmp(Employee employee){
        return "deleted";
    }

}
