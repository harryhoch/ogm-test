package edu.pitt.dbmi;

//http://neo4j.com/docs/ogm/java/stable/
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.session.Session;

public class Neo4jSessionFactory {

    private final static SessionFactory sessionFactory = new SessionFactory("edu.pitt.dbmi.domain");
    private static Neo4jSessionFactory factory = new Neo4jSessionFactory();
    private static String defaultURL="http://localhost:7474";
    
    public static Neo4jSessionFactory getInstance() {
	return factory;
    }
    
    private Neo4jSessionFactory() {
    }
    
    public Session getNeo4jSession() {
	return sessionFactory.openSession(defaultURL);
    }

    public Session getNeo4jSession(String address) {
	return sessionFactory.openSession(address);
    }
}
