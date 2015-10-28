package org.bitirmeprojesi.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.School;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(Teacher.class)
public class Teacher_ { 

    public static volatile SingularAttribute<Teacher, String> teacherLoginNumber;
    public static volatile SingularAttribute<Teacher, String> password;
    public static volatile SingularAttribute<Teacher, School> teacherSchoolId;
    public static volatile SingularAttribute<Teacher, Integer> teacherTeacherId;
    public static volatile SingularAttribute<Teacher, String> teacherName;
    public static volatile SingularAttribute<Teacher, String> teacherSurname;
    public static volatile SingularAttribute<Teacher, Boolean> enabled;

}