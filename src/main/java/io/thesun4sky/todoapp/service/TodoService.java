package io.thesun4sky.todoapp.service;

import org.springframework.stereotype.Service;

import io.thesun4sky.todoapp.controller.TodoRequestDTO;
import io.thesun4sky.todoapp.repository.Todo;
import io.thesun4sky.todoapp.repository.TodoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoService {
	private final TodoRepository todoRepository;

	// 할일 생성
	public Todo createTodo(TodoRequestDTO dto) {
		var newTodo = dto.toEntity();
		return todoRepository.save(newTodo);
	}
}
