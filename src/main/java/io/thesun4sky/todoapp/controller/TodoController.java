package io.thesun4sky.todoapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.thesun4sky.todoapp.repository.Todo;
import io.thesun4sky.todoapp.service.TodoService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TodoController {

	public final TodoService todoService;

	@PostMapping("/v1.0/todo")
	public ResponseEntity<TodoResponseDTO> postTodo(@RequestBody TodoRequestDTO dto) {
		Todo todo = todoService.createTodo(dto);
		TodoResponseDTO response = new TodoResponseDTO(todo);
		return ResponseEntity.ok().body(response);
	}
}
