package com.nestdigital.employeebackendapp.Controller;


import com.nestdigital.employeebackendapp.Model.EmployeeModel;
import com.nestdigital.employeebackendapp.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody EmployeeModel employee)
    {
        System.out.println(employee.toString());
        dao.save(employee);
        return "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployee")
    public List<EmployeeModel> ViewEmployee()
    {
        return (List<EmployeeModel>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteEmployee",consumes = "application/json",produces = "application/json")
    public String DeleteEmployee(@RequestBody EmployeeModel employee){
        dao.deleteEmployeeById(employee.getId());
        return "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmployee",consumes = "application/json",produces = "application/json")
    public  List<EmployeeModel> SearchEmployee(@RequestBody EmployeeModel employee)
    {
        return (List<EmployeeModel>) dao.searchEmployee(employee.getName());
    }
}
