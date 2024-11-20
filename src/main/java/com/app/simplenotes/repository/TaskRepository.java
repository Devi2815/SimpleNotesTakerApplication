package com.app.simplenotes.repository;

import com.app.simplenotes.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
