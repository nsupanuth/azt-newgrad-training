package com.example.demo.api;

import com.example.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/employee")
public interface EmployeeApi {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    Employee saveEmployee(@RequestBody Employee employee);

}
