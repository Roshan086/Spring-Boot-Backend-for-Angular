package com.spring.boot.backend.demo.services;


import com.spring.boot.backend.demo.beans.EmployeeBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    EmployeeBean saveEmployee(EmployeeBean employeeBean);

    EmployeeBean updateEmployee(EmployeeBean employeeBean);

    EmployeeBean deleteEmployee(EmployeeBean employeeBean);

    List<EmployeeBean> listOfEmployees();

    EmployeeBean findById(Long id);

    Page<EmployeeBean> findAllByFilterWithPaging(Pageable pageable);
}
