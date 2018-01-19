package com.greenfoxacademy.connectionwithmysql.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;
  private Date date;

  //@OneToOne(fetch = FetchType.LAZY)
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "assignee_id")
  public Assignee assignee;

  public Todo() {
  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
    this.date = new Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}


