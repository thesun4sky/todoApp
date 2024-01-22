package io.thesun4sky.todoapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@PostMapping("/v1.0/todo")
	public ResponseEntity postTodo() {
		// TODO 일정 작성 기능
		return ResponseEntity.ok().build();
	}
}
