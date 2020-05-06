package ru.geekbrains.pattern.lessons.persistence.entities.utils;



import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;


public abstract class SubjectObservations {
    private List<Observer> observers = new ArrayList<>();

    // подключить Наблюдателя
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // отключить Наблюдателя
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // проинформировать подписантов об изменениях
    protected void notify(Object arg){
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}
