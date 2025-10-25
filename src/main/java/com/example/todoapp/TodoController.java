package com.example.todoapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class TodoController {

  public static List<Todo> todos;

  public TodoController() {
    todos = new ArrayList<>();
    todos.add(new Todo(1,false, "todo 1", 1));
    todos.add(new Todo(2,true, "todo 2", 2));
  }

}
