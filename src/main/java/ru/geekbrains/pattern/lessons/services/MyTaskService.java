package ru.geekbrains.pattern.lessons.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.pattern.lessons.persistence.entities.MyTask;
import ru.geekbrains.pattern.lessons.persistence.repositories.MyTaskRepository;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MyTaskService {
    private final MyTaskRepository myTaskRepository;
    private Map<Long, MyTask> identityMap = new HashMap<>();

    public Map<Long, MyTask> showTasks() {
        if (identityMap.size() == 0){
            for (MyTask task: myTaskRepository.findAll()) {
                identityMap.put(task.getId(),task);
            }
        }
        return identityMap;
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
        long id = myTaskRepository.findAll().indexOf(task);
        identityMap.put(id,myTaskRepository.findById(id).get());
    }

    public String removeTask(Long id){

        if (identityMap.containsKey(id)){
            identityMap.remove(id);
            if (myTaskRepository.existsById(id)) {
            myTaskRepository.deleteById(id);
            }
        }// if not exist throw exception

        return "redirect:/";
    }
}
