
package edu.pitt.dbmi.service;

import edu.pitt.dbmi.domain.Department;
import edu.pitt.dbmi.GenericService;
import edu.pitt.dbmi.Neo4jSessionFactory;
import java.util.Map;
import java.util.Collections;

//@Service("departmentService")
public class DepartmentServiceImpl extends GenericService<Department> implements DepartmentService {

    @Override
    public Class<Department> getEntityType() {
        return Department.class;
    }

	public Iterable<Map<String,Object>> getDepartmentsByCourses() {
	String query = "match (d:Department)-[:CURRICULUM]->(s:Subject) return d.name,count(s) as classes order by classes";
	return Neo4jSessionFactory.getInstance().getNeo4jSession().query(query, Collections.EMPTY_MAP);
    }
}
