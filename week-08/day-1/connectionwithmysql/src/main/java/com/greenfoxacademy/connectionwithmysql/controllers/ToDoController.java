package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
  public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;

   /* @GetMapping("/todo")
    public String showTodo(Model model){
      return  "todo";
    }*/

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive){
      List<ToDo> todosList = new ArrayList<>();
      if (isActive == null) {
        toDoRepository.findAll().forEach(todosList::add);
      } else if (isActive) {
        todosList = StreamSupport.stream(toDoRepository.findAll().spliterator(), false)
                .filter(p -> p.isDone())
                .collect(Collectors.toList());
      } else {
        todosList = StreamSupport.stream(toDoRepository.findAll().spliterator(), false)
                .filter(p -> !p.isDone())
                .collect(Collectors.toList());
      }
      model.addAttribute("todosList", todosList);
      return "todo";
    }
}
