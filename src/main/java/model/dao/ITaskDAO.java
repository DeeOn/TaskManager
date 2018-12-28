package model.dao;

import model.Task;

import java.util.List;

public interface ITaskDAO {

    public List<Task> getTasks();
    public void updateStorage(List<Task> tasks);
}
