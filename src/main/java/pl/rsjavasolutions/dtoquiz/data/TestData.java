package pl.rsjavasolutions.dtoquiz.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.rsjavasolutions.dtoquiz.model.Answer;
import pl.rsjavasolutions.dtoquiz.model.Question;
import pl.rsjavasolutions.dtoquiz.model.Test;
import pl.rsjavasolutions.dtoquiz.service.TestService;

@Component
public class TestData implements CommandLineRunner {

    private TestService testService;

    @Autowired
    public TestData(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) throws Exception {

        Test test = new Test("Test wiedzy");
        Question question = new Question("What is the Capiotol of Poland");
        question.addAnswer(new Answer("Warszawa", true));
        question.addAnswer(new Answer("Mumbai", false));
        question.addAnswer(new Answer("Kolkatta", false));

        Question question2 = new Question("Who is CEO of Tesla Motors?");
        question2.addAnswer(new Answer("Bill Gates", false));
        question2.addAnswer(new Answer("Steve Jobs", false));
        question2.addAnswer(new Answer("Elon Musk", true));

        Question question3 = new Question("Name World's Richest Man?");
        question3.addAnswer(new Answer("Jeff Bazo", false));
        question3.addAnswer(new Answer("Bill Gates", false));
        question3.addAnswer(new Answer("Mark Zuckenberg", true));

        Question question4 = new Question("Word's Longest River?");
        question4.addAnswer(new Answer("River Nile", true));
        question4.addAnswer(new Answer("River Amazon", false));
        question4.addAnswer(new Answer("River Godavari", false));

        test.addQuestion(question);
        test.addQuestion(question2);
        test.addQuestion(question3);
        testService.save(test);
    }
}
