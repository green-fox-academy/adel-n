package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

  @Controller
  public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;

    @GetMapping("/todo")
    public String showTodo(Model model){
      return "todo";
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model){
      List<ToDo> todosList = new ArrayList<>();
      toDoRepository.findAll().forEach(todosList::add);
      model.addAttribute("todosList", todosList);
      return "todo";
    }
}
