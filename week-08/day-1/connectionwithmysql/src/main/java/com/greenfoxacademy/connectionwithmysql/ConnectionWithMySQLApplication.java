package com.greenfoxacademy.connectionwithmysql;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.greenfoxacademy.connectionwithmysql.factories.TodoFactory;
import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeServiceImpl;
import com.greenfoxacademy.connectionwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySQLApplication implements CommandLineRunner {

  @Autowired
  TodoService todoService;
  @Autowired
  AssigneeService assigneeService;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySQLApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Todo todo1 = new Todo("Finish H2 workshop1", true, false);
    Assignee assignee = new Assignee("Gizi", "gizi@gmail.com");
    Todo todo2 = new Todo("Finish JPA workshop2", false, false);
    Assignee assignee2 = new Assignee("Bela", "bela@citromail.com");
    Todo todo3 = new Todo("Finish H2 workshop1", true, true);
    Assignee assignee3 = new Assignee("Cili", "cili@yahoo.com");
    Todo todo4 = new Todo("It's another task", false, true);
    Assignee assignee4 = new Assignee("Geza", "geza@freemail.com");
    Todo todo5 = new Todo("It's another task", true, true);
    Assignee assignee5 = new Assignee("Pisti", "pisti@freemail.com");

    assignee.addTodo(todo1);
    assignee5.addTodo(todo2);
    assignee2.addTodo(todo3);
    assignee4.addTodo(todo4);
    assignee.addTodo(todo5);


    todoService.addTodo(todo1);
    todoService.addTodo(todo2);
    todoService.addTodo(todo3);
    todoService.addTodo(todo4);
    todoService.addTodo(todo5);

    assigneeService.addAssignee(assignee);
    assigneeService.addAssignee(assignee2);
    assigneeService.addAssignee(assignee3);
    assigneeService.addAssignee(assignee4);
    assigneeService.addAssignee(assignee5);



  /*  todoService.addTodo(new Todo("Start the day", true, true, assigneeService.;
    todoService.addTodo(new Todo("Finish H2 workshop1", true, true, assigneeService.getAssignee(3)));
    todoService.addTodo(new Todo("Finish JPA workshop2", false, false, assigneeService.getAssignee(4)));
    todoService.addTodo(new Todo("Create a CRUD project", true, true, assigneeService.getAssignee(5)));*/

		//assigneeService.addAssignee(new Assignee("Geza", "geza@gmail.com"));

/*    assigneeService.addAssignee(new Assignee("Bela", "bela@yahoo.com"));
    assigneeService.addAssignee(new Assignee("Cili", "cili@citromail.com"));
    assigneeService.addAssignee(new Assignee("Elemer", "elemer@freemail.com"));*/


  }
}
