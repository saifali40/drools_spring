package com.example.test.drool.model;

public class WorkerModel {
    private String prevId;
    private String actionType;

    public WorkerModel() {
        this.actionType = "EVENT_CREATE";
    }

    public String getPrevId() {
        return prevId;
    }

    public void setPrevId(String prevId) {
        this.prevId = prevId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}
