package ru.geekbrains.pattern.lessons.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.pattern.lessons.persistence.repositories.ChecklistRepository;

@Service
@RequiredArgsConstructor
public class ChecklistService {
    private final ChecklistRepository checklistRepository;
}
