package ru.geekbrains.pattern.lessons.persistence.entities;



import ru.geekbrains.pattern.lessons.persistence.entities.utils.MainEntity;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.ICreator;

import java.util.LinkedList;
import java.util.List;

public class Checklist extends MainEntity implements ICreator {
    List<Element> checklist = new LinkedList<>();

    public Element find(String name){
        return null;
    }

    @Override
    public void add() {
        checklist.add(new Element());
    }

    public Checklist(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Element element:checklist) {
            stringBuilder.append(element.getName() + " ");
        }
        return stringBuilder.toString();
    }

    public Checklist() {
    }

    @Override
    public void remove(Object o) {
        checklist.remove(o);
    }
}
