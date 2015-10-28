package org.bitirmeprojesi.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.StudentAssesment;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(Assignment.class)
public class Assignment_ { 

    public static volatile SingularAttribute<Assignment, String> assignmentContains;
    public static volatile ListAttribute<Assignment, StudentAssesment> studentAssesmentList;
    public static volatile SingularAttribute<Assignment, Integer> assignmentId;
    public static volatile SingularAttribute<Assignment, String> assignmentName;

}