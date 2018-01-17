package com.greenfoxacademy.connectionwithmysql.factories;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import org.springframework.stereotype.Component;

@Component
public class AssigneeFactory {

  public Assignee getEmptyAssignee() {
    return new Assignee();
  }
}
