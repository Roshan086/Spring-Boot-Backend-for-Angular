package com.spring.boot.backend.demo.services;


import com.spring.boot.backend.demo.beans.DepartmentBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface DepartmentService {
    DepartmentBean saveDepartment(DepartmentBean departmentBean);

    DepartmentBean updateDepartment(DepartmentBean departmentBean);

    DepartmentBean deleteDepartment(DepartmentBean departmentBean);

    List<DepartmentBean> listOfDepartments();

    DepartmentBean findById(Long id);

    Page<DepartmentBean> findAllByFilterWithPaging(Pageable pageable);
}
