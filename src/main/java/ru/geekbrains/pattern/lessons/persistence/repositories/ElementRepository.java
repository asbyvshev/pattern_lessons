package ru.geekbrains.pattern.lessons.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.pattern.lessons.persistence.entities.Element;

public interface ElementRepository extends JpaRepository<Element,  Long> {
}
