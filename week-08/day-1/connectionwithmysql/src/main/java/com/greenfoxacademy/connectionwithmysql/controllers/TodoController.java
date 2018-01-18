package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.factories.TodoFactory;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
  public class TodoController {

    @Autowired
    TodoService todoService;
    @Autowired
    TodoFactory todoFactory;

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive){
      List<Todo> todosList = new ArrayList<>();
      if (isActive == null) {
        todoService.getAllTodos().forEach(todosList::add);
      } else if (isActive) {
        todosList = StreamSupport.stream(todoService.getAllTodos().spliterator(), false)
                .filter(p -> p.getIsDone())
                .collect(Collectors.toList());
      } else {
        todosList = StreamSupport.stream(todoService.getAllTodos().spliterator(), false)
                .filter(p -> !p.getIsDone())
                .collect(Collectors.toList());
      }
      model.addAttribute("todosList", todosList);
      return "todo";
    }

    @GetMapping("/todo/add")
    public String add(Model model) {
      Todo todo = new Todo();
      model.addAttribute("todo", todo);
      return "add";
    }

    @PostMapping("/todo/add")
    public ModelAndView addTodo(@ModelAttribute Todo todo) {
      todoService.addTodo(todo);
      return new ModelAndView("redirect:/");
    }

    @PostMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id) {
      todoService.deleteTodo(id);
      return new ModelAndView("redirect:/");
    }

    @GetMapping("edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
      Todo todo = todoService.getTodoById(id);
      model.addAttribute("todo", todo);
      return "edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, @ModelAttribute Todo todo) {
      todo.setId(id);
      todoService.modifyTodo(todo);
      return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "search", required = false) String search, Model model) {
      List<Todo> searchList = todoService.searchByTitle(search);
      model.addAttribute("todosList", searchList);
      return "todo";
    }
}
