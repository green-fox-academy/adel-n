package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySQLApplication implements CommandLineRunner {

  @Autowired
  TodoRepository toDoRepository;
  @Autowired
  AssigneeRepository assigneeRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySQLApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new Todo("Learn Object Relational Mapping", true, false));
		toDoRepository.save(new Todo("Start the day", true, true));
		toDoRepository.save(new Todo("Finish H2 workshop1", true, true));
		toDoRepository.save(new Todo("Finish JPA workshop2", false, false));
		toDoRepository.save(new Todo("Create a CRUD project", true, true));

		assigneeRepository.save(new Assignee("Geza", "geza@gmail.com"));
		assigneeRepository.save(new Assignee("Gizi", "gizi@gmail.com"));
		assigneeRepository.save(new Assignee("Bela", "bela@gmail.com"));
  }
}
