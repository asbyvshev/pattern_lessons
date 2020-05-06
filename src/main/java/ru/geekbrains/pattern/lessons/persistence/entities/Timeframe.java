package ru.geekbrains.pattern.lessons.persistence.entities;

import lombok.*;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.SubjectObservations;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.Observer;

import javax.persistence.Entity;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Timeframe extends SubjectObservations {

    private Long id;
    private Date dataCreate;
    private Date dataExecution;
    private String notify;

    public Timeframe(Observer observer) {
        this.dataCreate = new Date();
        attach(observer);
    }

    @Override
    public String toString() {
        return dataCreate.toString() + " " + notify;
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
