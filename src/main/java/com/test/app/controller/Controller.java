package com.test.app.controller;

import com.test.app.dto.TestDTO;
import com.test.app.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Controller {
    private final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private TestService testService;

    @PostMapping(path = "/data")
    public String saveData(@RequestBody TestDTO testDto) {
        log.info("POST Call received at TestDTO/add data with DTO" + testDto);
        return testService.saveAndPrint(testDto);
    }
}
