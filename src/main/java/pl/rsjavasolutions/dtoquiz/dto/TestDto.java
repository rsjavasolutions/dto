package pl.rsjavasolutions.dtoquiz.dto;

import java.util.List;

public class TestDto {

    private String name;
    private List<QuestionDto> questionDtoList;

    public TestDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestionDto> getQuestionDtoList() {
        return questionDtoList;
    }

    public void setQuestionDtoList(List<QuestionDto> questionDtoList) {
        this.questionDtoList = questionDtoList;
    }
}
