package org.bitirmeprojesi.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.StudentAssesment;
import org.bitirmeprojesi.entity.Teacher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(Test.class)
public class Test_ { 

    public static volatile SingularAttribute<Test, byte[]> testContains;
    public static volatile SingularAttribute<Test, Teacher> testTeacherId;
    public static volatile SingularAttribute<Test, String> testTopicName;
    public static volatile SingularAttribute<Test, String> testLessonName;
    public static volatile ListAttribute<Test, StudentAssesment> studentAssesmentList;
    public static volatile SingularAttribute<Test, Integer> testId;
    public static volatile SingularAttribute<Test, String> testName;

}