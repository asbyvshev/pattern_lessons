package ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces;


import ru.geekbrains.pattern.lessons.persistence.entities.utils.SubjectObservations;

public interface Observer {
    void update(SubjectObservations subject, Object arg);
}
