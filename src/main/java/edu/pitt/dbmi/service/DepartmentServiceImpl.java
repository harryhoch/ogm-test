
package edu.pitt.dbmi.service;

import edu.pitt.dbmi.domain.Department;
import edu.pitt.dbmi.GenericService;

//@Service("departmentService")
public class DepartmentServiceImpl extends GenericService<Department> implements DepartmentService {

    @Override
    public Class<Department> getEntityType() {
        return Department.class;
    }
}
