/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitirmeprojesi.daoImpl;

import java.io.Serializable;
import javax.inject.Named;
import org.bitirmeprojesi.dao.StudentOperationsDAO;
import org.bitirmeprojesi.entity.Student;

/**
 *
 * @author Batuhan
 */
@Named("studentOperationsDAO")
public class StudentOperationsDAOImpl extends GenericJPADAOImpl<Student, Serializable> implements StudentOperationsDAO {

    @Override
    public void addStudent(Student student) {
        try {
            this.create(student);
        }catch(Exception e){
            System.out.println("Error from StudentOperationsDAOImpl:"+e.getLocalizedMessage());
        }
    }

}
