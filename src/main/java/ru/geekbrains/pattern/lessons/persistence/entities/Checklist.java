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
public class Checklist extends MainEntity implements ICreator {

    private String name;

    @OneToMany
    @JoinTable(
            name = "list_elements",
            joinColumns = @JoinColumn(name = "id_checklist"),
            inverseJoinColumns = @JoinColumn(name = "id_element")
    )
    List<Element> checklist;

    @Override
    public void add() {
        checklist.add(new Element());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Element element:checklist) {
            stringBuilder.append(element.getName() + " ");
        }
        return stringBuilder.toString();
    }

    @Override
    public void remove(Object o) {
        checklist.remove(o);
    }
}
