package ru.geekbrains.pattern.lessons.persistence.entities;


import ru.geekbrains.pattern.lessons.persistence.entities.utils.MainEntity;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.ICreator;

import java.util.LinkedList;
import java.util.List;

public class MyTask extends MainEntity implements ICreator {

    private String description;
    private boolean done;
    private List checklists = new LinkedList<>();
    private Timeframe timeframe;

    public Timeframe getTimeframe() {
        return timeframe;
    }

    public List getChecklists() {
        return checklists;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setTimeframe(Timeframe timeframe) {
        this.timeframe = timeframe;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return getName() +"{" +
                "description='" + description + '\'' +
                ", checklists=" + checklists +
                ", timeframe=" + timeframe +
                '}';
    }

    @Override
    public void add() {
        checklists.add(new Checklist("Список"));
    }

    @Override
    public void remove(Object o) {
        checklists.remove(o);
    }
}
