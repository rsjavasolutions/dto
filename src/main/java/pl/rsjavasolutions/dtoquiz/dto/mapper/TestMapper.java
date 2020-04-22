package pl.rsjavasolutions.dtoquiz.dto.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.rsjavasolutions.dtoquiz.dto.TestDto;
import pl.rsjavasolutions.dtoquiz.model.Question;
import pl.rsjavasolutions.dtoquiz.model.Test;

@Component
public class TestMapper {

    private QuestionMapper questionMapper;

    @Autowired
    public TestMapper(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    public TestDto mapToTestDto(Test test){
        TestDto testDto = new TestDto();
        testDto.setName(test.getName());
        testDto.setQuestionDtoList(questionMapper.mapToListQuestionDto(test.getQuestionList()));
        return testDto;
    }
}
