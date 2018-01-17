package com.greenfoxacademy.connectionwithmysql.factories;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoFactory {

  public Todo getEmptyTodo() {
    return new Todo();
  }
}
