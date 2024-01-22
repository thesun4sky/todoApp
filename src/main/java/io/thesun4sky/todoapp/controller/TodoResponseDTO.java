package io.thesun4sky.todoapp.controller;

import java.time.LocalDateTime;

import io.thesun4sky.todoapp.repository.Todo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoResponseDTO {

	private String title;

	private String content;

	private String userName;

	private LocalDateTime createdAt;

	public TodoResponseDTO(Todo todo) {
		this.title = todo.getTitle();
		this.content = todo.getContent();
		this.userName = todo.getUserName();
		this.createdAt = todo.getCreatedAt();
	}
}
