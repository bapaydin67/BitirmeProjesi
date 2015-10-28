package org.bitirmeprojesi.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.Teacher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> studentId;
    public static volatile SingularAttribute<Student, String> studentClassname;
    public static volatile SingularAttribute<Student, Long> studentLoginnumber;
    public static volatile SingularAttribute<Student, Teacher> studentTeacherId;
    public static volatile SingularAttribute<Student, Integer> studentSurname;
    public static volatile SingularAttribute<Student, String> studentName;
    public static volatile SingularAttribute<Student, Short> studentStudentNumber;
    public static volatile SingularAttribute<Student, String> studentLoginpassword;

}