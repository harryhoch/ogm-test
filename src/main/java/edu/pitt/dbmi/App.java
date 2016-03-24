package edu.pitt.dbmi;

import org.neo4j.ogm.session.Session;

import edu.pitt.dbmi.domain.Subject;
import edu.pitt.dbmi.domain.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

	Subject s = new Subject();
	s.setName("Scheme");
	Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();
	Department d = new Department();
	d.setName("Computer Science");
	d.addSubject(s);
	session.save(d);
	session.save(s);
        System.out.println( "Hello World!" );
    }
}
