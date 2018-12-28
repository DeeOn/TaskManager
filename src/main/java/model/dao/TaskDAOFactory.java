package model.dao;

public class TaskDAOFactory {

    public ITaskDAO getDAO() {
        return new TestTaskDAO();
    }
}
