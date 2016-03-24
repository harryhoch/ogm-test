
package edu.pitt.dbmi.service;

import edu.pitt.dbmi.domain.Subject;
import edu.pitt.dbmi.GenericService;

//@Service("departmentService")
public class SubjectServiceImpl extends GenericService<Subject> implements SubjectService {

    @Override
    public Class<Subject> getEntityType() {
        return Subject.class;
    }
}
