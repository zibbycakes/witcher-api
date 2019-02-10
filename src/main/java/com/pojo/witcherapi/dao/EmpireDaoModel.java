package com.pojo.witcherapi.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empire")
public class EmpireDaoModel {
    @Id
    private String id;
    private String name;

    public EmpireDaoModel () {}

    public EmpireDaoModel(String id, String name) {
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
