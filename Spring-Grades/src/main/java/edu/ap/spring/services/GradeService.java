package edu.ap.spring.services;

import edu.ap.spring.model.Grade;
import edu.ap.spring.model.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GradeService {


    GradeRepository repository;

    @Autowired
    public GradeService(GradeRepository repository) {
        this.repository = repository;
    }

    public Iterable<Grade> findAll() {

        return repository.findAll();
    }

    public void save(Grade grade) {

        repository.save(grade);
    }
}
