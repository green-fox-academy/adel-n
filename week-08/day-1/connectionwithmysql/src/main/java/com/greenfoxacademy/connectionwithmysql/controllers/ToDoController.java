package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
  public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;

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

    @GetMapping("/todo/add")
    public String add(Model model) {
      ToDo toDo = new ToDo();
      model.addAttribute("todo", toDo);
      return "add";
    }

    @PostMapping("/todo/add")
    public ModelAndView addTodo(@ModelAttribute ToDo toDo) {
      toDoRepository.save(toDo);
      return new ModelAndView("redirect:/todo/");
    }
}
