package ru.geekbrains.pattern.lessons.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.pattern.lessons.persistence.entities.MyTask;
import ru.geekbrains.pattern.lessons.persistence.entities.utils.interfaces.ICreator;
import ru.geekbrains.pattern.lessons.persistence.repositories.MyTaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyTaskService {
    private final MyTaskRepository myTaskRepository;

    public List<MyTask> showTasks() {
        return myTaskRepository.findAll();
    }

    public String addTask(){
        add();
        return "redirect:/";
    }

    @Transactional
    public void add() {
        MyTask task = MyTask.builder()
                .description("описание")
                .name("новая задача")
                .build();
        myTaskRepository.save(task);
    }

    public String removeTask(Long id){
        if (myTaskRepository.existsById(id)) {
            myTaskRepository.deleteById(id);
        } // if not exist throw exception

        return "redirect:/";
    }
}
