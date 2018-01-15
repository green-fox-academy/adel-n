package com.greenfoxacademy.listingtodoswithh2;

import com.greenfoxacademy.listingtodoswithh2.models.ToDo;
import com.greenfoxacademy.listingtodoswithh2.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingToDosWithH2Application implements CommandLineRunner{

	@Autowired
  ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingToDosWithH2Application.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("I have to learn Object Relational Mapping", true, false));
    toDoRepository.save(new ToDo("Start the day", true, true));
    toDoRepository.save(new ToDo("Finish H2 workshop1", true, true));
    toDoRepository.save(new ToDo("Finish JPA workshop2", true, false));
    toDoRepository.save(new ToDo("Create a CRUD project", true, true));
  }
}
