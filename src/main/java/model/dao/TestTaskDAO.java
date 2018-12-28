package model.dao;

import model.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestTaskDAO implements ITaskDAO {

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private final List<Task> tasks;

    {
        tasks = new ArrayList<>();
        try {
            tasks.add(new Task("Task1", simpleDateFormat.parse("02-04-2018 11:35:42"),
                    simpleDateFormat.parse("02-04-2018 12:35:42")));

            tasks.add(new Task("Task2", simpleDateFormat.parse("03-04-2018 0:35:42"),
                    simpleDateFormat.parse("04-04-2018 18:35:42")));

            tasks.add(new Task("Task3", simpleDateFormat.parse("04-04-2018 11:35:42"),
                    simpleDateFormat.parse("07-04-2018 15:35:42")));
        } catch (ParseException e) {e.printStackTrace();}

    }

    @Override
    public List<Task> getTasks() {
       return tasks;
    }

    @Override
    public void updateStorage(List<Task> tasks) {

    }
}
