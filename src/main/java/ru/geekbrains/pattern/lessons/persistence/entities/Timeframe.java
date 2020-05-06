package ru.geekbrains.pattern.lessons.persistence.entities;



import ru.geekbrains.pattern.lessons.persistence.entities.utils.SubjectObservations;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.Observer;

import java.util.Date;

public class Timeframe extends SubjectObservations {

    private Long id;
    private Date dataCreate;
    private Date dataExecution;
    private String notify;

    public Timeframe(Observer observer) {
        this.dataCreate = new Date();
        attach(observer);
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return dataCreate.toString() + " " + notify;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public Date getDataExecution() {
        return dataExecution;
    }

    public void setDataExecution(Date dataExecution) {
        this.dataExecution = dataExecution;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }
    public boolean verifyDeadlines(){

        long currentDate = new Date().getTime();
        long untilTheEnd = dataExecution.getTime() - currentDate;

        if (untilTheEnd > 0){
            return false;
        }

        notify("We're past deadline!");
        return true;
    }
}
