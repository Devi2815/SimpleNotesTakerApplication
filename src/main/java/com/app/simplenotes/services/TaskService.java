package com.app.simplenotes.services;

import com.app.simplenotes.models.Task;
import com.app.simplenotes.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public void createTasks(String title, String content) {
		Task task = new Task();
		task.setTitle(title);
		task.setContent(content);
		task.setCompleted(false);
		taskRepository.save(task);
	}

	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
	}

	public void toggleTask(Long id) {
		Task task = taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
		task.setCompleted(!task.isCompleted());
		taskRepository.save(task);
	}

	public Task getTaskById(Long id) {
		return taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid task id: " + id));
	}

	public void updateTask(Long id, String title, String content) {
		Task task = getTaskById(id);
		task.setTitle(title);
		task.setContent(content);
		taskRepository.save(task);
	}
}
