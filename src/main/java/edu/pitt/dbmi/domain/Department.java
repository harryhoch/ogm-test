package edu.pitt.dbmi.domain;

import java.util.Set;
import java.util.HashSet;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label="Department")
public class Department extends Entity {
    private String name;
    private String chair;


    @Relationship(type = "CURRICULUM")
    private Set<Subject> subjects;

    public Department() {
	subjects = new HashSet<Subject>();
    }

    public Department(String d) {
	setName(d);
    }

    public void setName(String n) {
	name =n;
    }

    public String getName() {
	return name;
    }


    public Set<Subject> getSubjects() {
	return subjects;
    }

    public void addSubject(Subject s) {
	subjects.add(s);
    }

    public void setChair(String c) {
	chair = c;
    }

    public String getChair() {
	return chair;
    }
}
