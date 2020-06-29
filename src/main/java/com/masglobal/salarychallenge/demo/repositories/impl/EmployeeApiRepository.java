package com.masglobal.salarychallenge.demo.repositories.impl;

import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;
import com.masglobal.salarychallenge.demo.repositories.IEmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class EmployeeApiRepository implements IEmployeeRepository {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${employee.api.url}")
    private String employeeUrl;

    @Override
    public List<EmployeeEntity> getEmployees() {
        String url = employeeUrl;
        ResponseEntity<List<EmployeeEntity>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EmployeeEntity>>() {});
        return response.getBody();
    }
}
