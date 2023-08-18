package com.example.test.drool.model;

import com.example.test.drool.enums.EventTypes;

import java.util.Map;
import java.util.Set;

public class HookLogger {
    private String brand;
    private EventTypes type;
    private boolean external;
    private boolean recurring;
    private String action;

    private String title;
    private String notes;
    private ChangedProperty changeLog;

    private Set<String> guest;

    private String subject;
    private String message;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public EventTypes getType() {
        return type;
    }

    public void setType(EventTypes type) {
        this.type = type;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isRecurring() {
        return recurring;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ChangedProperty getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(ChangedProperty changeLog) {
        this.changeLog = changeLog;
    }

    public Set<String> getGuest() {
        return guest;
    }

    public void setGuest(Set<String> guest) {
        this.guest = guest;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
