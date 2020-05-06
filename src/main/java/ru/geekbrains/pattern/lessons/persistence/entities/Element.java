package ru.geekbrains.pattern.lessons.persistence.entities;


import ru.geekbrains.pattern.lessons.persistence.entities.utils.MainEntity;

public class Element extends MainEntity {
    private boolean checked;

    public boolean isChecked() {
        return checked;
    }
}
