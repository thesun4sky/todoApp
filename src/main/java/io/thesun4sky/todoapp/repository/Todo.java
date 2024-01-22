package io.thesun4sky.todoapp.repository;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "todo_id", nullable = false)
	private Long todoId;

	private String title;

	private String content;

	private String userName;

	private String password;

	private LocalDateTime createdAt;

	@Builder
	public Todo(String title, String content, String userName, String password) {
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.password = password;
		this.createdAt = LocalDateTime.now();
	}
}
