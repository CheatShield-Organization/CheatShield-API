package org.cs.repository;

import org.cs.entity.Exam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExamRepository extends CrudRepository<Exam,Integer> {
}
