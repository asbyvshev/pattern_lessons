package ru.geekbrains.pattern.lessons.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.pattern.lessons.persistence.repositories.ElementRepository;

@Service
@RequiredArgsConstructor
public class ElementService {
    private final ElementRepository elementRepository;
}
