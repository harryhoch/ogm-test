package edu.pitt.dbmi;

import java.util.Collection;
import java.lang.Iterable;
import java.util.Map;
import java.util.Set;
import org.neo4j.ogm.session.Session;

import edu.pitt.dbmi.domain.Subject;
import edu.pitt.dbmi.domain.Department;

import edu.pitt.dbmi.service.DepartmentServiceImpl;

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
	d.setChair("Lu");
	s.setDepartment(d);
	Subject s2 = new Subject("Compilers");
	s2.setDepartment(d);
	session.save(d,1);
	session.save(s2,1);
	session.save(s,1);


	Department d2= new Department("Biomedical Informatics");
	Subject s3 = new Subject("HCI");
	Subject s4 = new Subject("Eval");
	s3.setDepartment(d2);
	s4.setDepartment(d2);

	session.save(d2,1);
	session.save(s3,1);
	session.save(s4,1);

      Collection<Department> departments = session.loadAll(Department.class);
	System.err.println("departments...");
	for (Department dt: departments) {
	    System.err.println(".."+dt.getName());
	}
	DepartmentServiceImpl dsl = new DepartmentServiceImpl();
	Iterable<Map<String,Object>> obs = dsl.getDepartmentsByCourses();
	for (Map<String,Object> ob : obs) {
	    System.err.println(".....");
	    Set <String> keys = ob.keySet();
	    for (String key: keys) {
		System.err.println(key+"   "+ob.get(key));
	    }
	}
    }
}
