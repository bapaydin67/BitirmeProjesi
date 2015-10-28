package org.bitirmeprojesi.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.Assignment;
import org.bitirmeprojesi.entity.Student;
import org.bitirmeprojesi.entity.Test;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(StudentAssesment.class)
public class StudentAssesment_ { 

    public static volatile SingularAttribute<StudentAssesment, Assignment> sAAssignmentId;
    public static volatile SingularAttribute<StudentAssesment, Date> sAAssignmentDeliveryDate;
    public static volatile SingularAttribute<StudentAssesment, Short> sAAssignmentScore;
    public static volatile SingularAttribute<StudentAssesment, Date> sATestDeliveryDate;
    public static volatile SingularAttribute<StudentAssesment, Test> sATestId;
    public static volatile SingularAttribute<StudentAssesment, Student> sAStudentId;
    public static volatile SingularAttribute<StudentAssesment, Short> sATestWrongAnswer;
    public static volatile SingularAttribute<StudentAssesment, Short> sATestCorrectAnswer;
    public static volatile SingularAttribute<StudentAssesment, Integer> sAId;

}