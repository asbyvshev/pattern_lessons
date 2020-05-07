package ru.geekbrains.pattern.lessons.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.pattern.lessons.persistence.entities.MyTask;

public interface MyTaskRepository extends JpaRepository<MyTask, Long> {}
