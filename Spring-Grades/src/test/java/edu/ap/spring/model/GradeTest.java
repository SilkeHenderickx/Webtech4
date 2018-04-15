package edu.ap.spring.model;


import edu.ap.spring.services.GradeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GradeTest {

    Grade sut = new Grade("Silke", "Henderickx", 20);

    @Autowired
    GradeService gradeService;

    @Test
    public void GivenStringName_WhenNameToAllCaps_ThenNameAllCaps() {

        String result = sut.nameToAllcaps(sut.getFirstName());

        assertThat( result, is("SILKE"));
    }

    @Test
    public void ServiceTest(){

        gradeService.save(sut);

        Iterable<Grade> gradeList = gradeService.findAll();

        // if doesn't work: add override for equals() and hashcode() in Grade
        assertThat(gradeList, hasItem(sut));

    }

}
