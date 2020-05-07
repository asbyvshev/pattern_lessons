package ru.geekbrains.pattern.lessons.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.pattern.lessons.persistence.entities.Timeframe;

public interface TimeframeRepository extends JpaRepository<Timeframe, Long> {
}
