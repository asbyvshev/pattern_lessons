package ru.geekbrains.pattern.lessons.persistence.entities;

import lombok.*;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.MainEntity;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Element extends MainEntity {

    private boolean checked;
    private String name;
}
