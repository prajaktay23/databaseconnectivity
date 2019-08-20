package databaseconnec.example.databaseconnectivity.dao;

import databaseconnec.example.databaseconnectivity.model.employee;
import databaseconnec.example.databaseconnectivity.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao implements EmployeeRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<employee> getEmpList(){

        String sql="select * from employee";
        List<employee> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(employee.class));
        return list;
    }
}
