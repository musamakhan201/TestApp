package com.test.app.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.app.dto.TestDTO;
import com.test.app.repository.TestRepository;
import com.test.app.domain.TestDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final Logger log = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TestRepository testRepository;

    public String saveAndPrint(TestDTO testDTO) {
        String response;
        TestDomain testDomain = objectMapper.convertValue(testDTO, TestDomain.class);
        log.info("* * * * * * * * * * * * * * * * * * * *");
        log.info("* * * * * *Starting Printing* * * * * *");
        log.info("* * * * * * * * * * * * * * * * * * * *");
        for (int i = 0; i < testDTO.getCount(); i++) {
            log.info(testDTO.getInfo());
        }
        testRepository.save(testDomain);
        response = "Data Saved.";
        log.info(response);
        return response;
    }
}
