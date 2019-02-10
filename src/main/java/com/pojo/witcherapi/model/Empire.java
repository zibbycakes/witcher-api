package com.pojo.witcherapi.model;

public class Empire {

    private String id;
    private String name;

    public Empire () {}

    public Empire(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
