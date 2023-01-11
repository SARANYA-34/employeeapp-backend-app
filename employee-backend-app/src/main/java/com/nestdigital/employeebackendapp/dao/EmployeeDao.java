package com.nestdigital.employeebackendapp.dao;

import com.nestdigital.employeebackendapp.Model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {


    @Modifying
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployeeById(Integer id);


    @Query(value = "SELECT * FROM `employee` WHERE `name` LIKE concat('%',:name,'%')",nativeQuery = true)
    List<EmployeeModel> searchEmployee(String name);

}
