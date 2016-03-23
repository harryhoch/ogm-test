package edu.pitt.dbmi.domain;

import java.util.Set;
import java.util.HashSet;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Department extends Entity {
    private String name;

    @Relationship(type = "CURRICULUM")
    private Set<Subject> subjects;

    public Department() {
	subjects = new HashSet<Subject>();
    }


    public Set<Subject> getSubjects() {
	return subjects;
    }

    public void addSubject(Subject s) {
	subjects.add(s);
    }
}
