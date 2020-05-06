package ru.geekbrains.pattern.lessons.persistence.entities;

import lombok.*;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.MainEntity;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.ICreator;

import javax.persistence.*;

import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MyTask extends MainEntity implements ICreator {

    private boolean done;
    private String description;
    private String name;
    @OneToOne
    @JoinColumn(name = "timeframe")
    private Timeframe timeframe;

    @OneToMany
    @JoinTable(
            name = "mytask_checklists",
            joinColumns = @JoinColumn(name = "id_task"),
            inverseJoinColumns = @JoinColumn(name = "id_checklist")
    )
    private List checklists = new LinkedList<>();


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
        checklists.add(new Checklist().builder().name("Список").build());
    }

    @Override
    public void remove(Object o) {
        checklists.remove(o);
    }
}
