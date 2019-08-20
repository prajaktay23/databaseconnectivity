package databaseconnec.example.databaseconnectivity.controller;

import databaseconnec.example.databaseconnectivity.dao.EmployeeDao;
import databaseconnec.example.databaseconnectivity.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeedao;
    @GetMapping(value="/getmap")
    public List<employee> getEmployees(){
        List<employee> list=employeedao.getEmpList();
        return list;
    }
}
