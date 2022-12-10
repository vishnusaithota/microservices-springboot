package com.microservices.departmentservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method in Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("inside findByDepartmentId method in Department Controller");
        return departmentService.findByDepartmentId(departmentId);
    }
}
