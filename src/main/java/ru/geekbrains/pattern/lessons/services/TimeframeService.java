package ru.geekbrains.pattern.lessons.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.pattern.lessons.persistence.repositories.TimeframeRepository;

@Service
@RequiredArgsConstructor
public class TimeframeService {
    private final TimeframeRepository timeframeRepository;
}
