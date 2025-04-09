package com.todo.service;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> getAllTodo() {
        todoRepository.findAll();
    }


}
