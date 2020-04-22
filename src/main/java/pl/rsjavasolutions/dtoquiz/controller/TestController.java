package pl.rsjavasolutions.dtoquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rsjavasolutions.dtoquiz.dto.TestDto;
import pl.rsjavasolutions.dtoquiz.dto.mapper.TestMapper;
import pl.rsjavasolutions.dtoquiz.model.Test;
import pl.rsjavasolutions.dtoquiz.service.TestService;

@RestController
@RequestMapping("/api/")
public class TestController {

    private TestService testService;
    private TestMapper testMapper;

    @Autowired
    public TestController(TestService testService, TestMapper testMapper) {
        this.testService = testService;
        this.testMapper = testMapper;
    }

    @GetMapping("tests/{id}")
    public TestDto getTestById(@PathVariable Integer id){
       return testMapper.mapToTestDto(testService.getById(id));
    }
}
