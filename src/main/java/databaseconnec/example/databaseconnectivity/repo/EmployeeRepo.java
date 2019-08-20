package databaseconnec.example.databaseconnectivity.repo;

import databaseconnec.example.databaseconnectivity.model.employee;

import java.util.List;

public interface EmployeeRepo {
    List<employee> getEmpList();
}
