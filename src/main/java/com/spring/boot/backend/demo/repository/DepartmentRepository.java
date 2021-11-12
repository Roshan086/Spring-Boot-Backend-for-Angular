package com.spring.boot.backend.demo.repository;


import com.spring.boot.backend.demo.beans.DepartmentBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository extends JpaRepository<DepartmentBean, Long>, JpaSpecificationExecutor<DepartmentBean> {
    Page<DepartmentBean> findAll(Pageable pageable);
}
