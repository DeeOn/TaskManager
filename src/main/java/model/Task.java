package model;

import java.util.Date;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Task {

    private final UUID id;
    private String name;
    private Date startDate;
    private Date stopDate;

    public Task(final String name, final Date startDate, final Date stopDate) {
        this.id = randomUUID();
        this.setName(name);
        this.setStartDate(startDate);
        this.setStopDate(stopDate);
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }
}
