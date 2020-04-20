package pl.rsjavasolutions.dtoquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rsjavasolutions.dtoquiz.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
}
