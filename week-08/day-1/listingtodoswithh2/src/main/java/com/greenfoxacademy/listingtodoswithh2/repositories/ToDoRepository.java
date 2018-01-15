package com.greenfoxacademy.listingtodoswithh2.repositories;

import com.greenfoxacademy.listingtodoswithh2.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long>{

}
