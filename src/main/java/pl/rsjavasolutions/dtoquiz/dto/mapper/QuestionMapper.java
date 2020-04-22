package pl.rsjavasolutions.dtoquiz.dto.mapper;

import org.springframework.stereotype.Component;
import pl.rsjavasolutions.dtoquiz.dto.QuestionDto;
import pl.rsjavasolutions.dtoquiz.model.Question;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    private QuestionDto mapToQuestionDto(Question question){
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setContent(question.getContent());
        questionDto.setAnswers(getAllAnswers(question));
        questionDto.setCorrectAnswer(getCorrectAnswer(question));
        return questionDto;
    }

    private List<String> getAllAnswers(Question question){
        return question.getAnswerList().stream()
                .map(answer -> answer.getName())
                .collect(Collectors.toList());
    }

    private String getCorrectAnswer(Question question){
        return question.getAnswerList().stream()
                .filter(answer -> answer.getCorrect())
                .map(answer -> answer.getName())
                .findFirst().get();
    }

    public List<QuestionDto> mapToListQuestionDto(List<Question> questionList){
        return questionList.stream()
                .map(question -> mapToQuestionDto(question))
                .collect(Collectors.toList());
    }
}
