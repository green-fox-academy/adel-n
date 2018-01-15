package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySQLApplication implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySQLApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("Learn Object Relational Mapping", true, false));
		toDoRepository.save(new ToDo("Start the day", true, true));
		toDoRepository.save(new ToDo("Finish H2 workshop1", true, true));
		toDoRepository.save(new ToDo("Finish JPA workshop2", false, false));
		toDoRepository.save(new ToDo("Create a CRUD project", true, true));
  }
}
