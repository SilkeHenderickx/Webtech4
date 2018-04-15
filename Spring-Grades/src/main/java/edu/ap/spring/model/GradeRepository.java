package edu.ap.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Map;
import java.util.Set;


@Repository
@Transactional
public interface GradeRepository extends CrudRepository<Grade, Long>{

}
