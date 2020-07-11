package pl.rsjavasolutions.dtoquiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rsjavasolutions.dtoquiz.exception.InvalidNumberException;
import pl.rsjavasolutions.dtoquiz.model.Test;
import pl.rsjavasolutions.dtoquiz.repository.TestRepository;

import java.util.Optional;

@Service
public class TestService {

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Test getById(Integer id) {
        return testRepository.findById(id)
                .orElseThrow(() -> new InvalidNumberException(id));
    }

    public Test save(Test test){
        return testRepository.save(test);
    }
}
