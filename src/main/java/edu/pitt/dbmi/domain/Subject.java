package edu.pitt.dbmi.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Subject extends Entity{
    private String name;

    @Relationship(type="CURRICULUM", direction = Relationship.INCOMING)
    private Department department;

    public Subject() {
    }

    public Department getDepartment() {
	return department;
    }

    public void setDepartment(Department d) {
	department = d;
    }

    public void setName(String n)  {
	name=n;
    }

    public String getName() {
	return name;
    }
}
