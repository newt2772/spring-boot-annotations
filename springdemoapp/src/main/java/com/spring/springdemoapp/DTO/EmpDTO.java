package com.spring.springdemoapp.DTO;

import com.spring.springdemoapp.Entity.Employee;

public class EmpDTO {
    String name;
    String dept;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static EmpDTO empMapper(Employee employee) {
        EmpDTO dto = new EmpDTO();
        dto.setName(employee.getName());
        dto.setAge(employee.getAge());
        dto.setDept(employee.getDept());
        return dto;
    }
}
