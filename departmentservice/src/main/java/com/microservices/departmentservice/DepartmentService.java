package com.microservices.departmentservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method in Department Service");
        return departmentRepository.save(department);
    }


    public Department findByDepartmentId(Long departmentId) {
        log.info("inside findByDepartmentId method in Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
