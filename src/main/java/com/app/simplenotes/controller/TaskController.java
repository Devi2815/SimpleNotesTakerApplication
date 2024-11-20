package com.app.simplenotes.controller;

import com.app.simplenotes.models.Task;
import com.app.simplenotes.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	@GetMapping("/tasks")
	public String getTask(Model model){
		List<Task> tasks = taskService.getAllTasks();
		model.addAttribute("tasks", tasks);
		return "tasks";
	}

	@PostMapping("/tasks")
	public String createTask(@RequestParam String title, @RequestParam String content){
		taskService.createTasks(title, content);

		return "redirect:/tasks";
	}



	@GetMapping("/{id}/toggle")
	public String toggleTask(@PathVariable Long id){
		taskService.toggleTask(id);
		return "redirect:/tasks";
	}

	@GetMapping("/edit/{id}")
	public String editTask(@PathVariable Long id, Model model){
		Task task = taskService.getTaskById(id);
		model.addAttribute("task", task);
		return "edit";
	}
	@PostMapping("/edit/{id}")
	public String updateTask(@PathVariable Long id, @RequestParam String title, @RequestParam String content){
		taskService.updateTask(id, title, content);
		return "redirect:/tasks";
	}

	@GetMapping("/{id}/delete")
	public String deleteTask(@PathVariable Long id){
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}


}
