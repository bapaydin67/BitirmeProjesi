package org.bitirmeprojesi.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.bitirmeprojesi.entity.Teacher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-28T23:26:16")
@StaticMetamodel(School.class)
public class School_ { 

    public static volatile SingularAttribute<School, String> schoolCity;
    public static volatile SingularAttribute<School, Integer> schooldId;
    public static volatile SingularAttribute<School, Date> schoolfoundationYear;
    public static volatile ListAttribute<School, Teacher> teacherList;
    public static volatile SingularAttribute<School, String> schoolName;
    public static volatile SingularAttribute<School, String> schoolDistrict;

}