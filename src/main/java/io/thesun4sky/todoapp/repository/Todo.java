package io.thesun4sky.todoapp.repository;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
