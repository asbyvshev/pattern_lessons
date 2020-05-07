package ru.geekbrains.pattern.lessons.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.pattern.lessons.persistence.entities.Checklist;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {
}
