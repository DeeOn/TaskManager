package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TaskListModel extends AbstractTableModel {

    private static final String[] headers = {"Name", "StartDate", "StopDate"};
    private final List<Task> tasks;

    public TaskListModel(final List<Task> tasks) {
        this.tasks = tasks;
    }


    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Task task = tasks.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return task.getName();
            case 1:
                return task.getStartDate();
            default:
                return task.getStopDate();
        }
    }
}
