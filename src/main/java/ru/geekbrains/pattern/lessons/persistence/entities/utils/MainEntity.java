package ru.geekbrains.pattern.lessons.persistence.entities.utils;

import lombok.Data;

@Data
public abstract class MainEntity {
    private Long id;
    private String name;
}
