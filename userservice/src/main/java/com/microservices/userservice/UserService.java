package com.microservices.userservice;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser method inside user Service");
        return userRepository.save(user);
    }

    public ResponseTemplateVO findUserById(Long userId) {
        log.info("Inside findUserById method inside user Service");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        vo.setUser(user);

        Department department =
                restTemplate.getForObject("http://DEPARTMENT/departments/" + user.getDepartmentId()
                        ,Department.class);
        vo.setDepartment(department);

        return vo;

    }
}
