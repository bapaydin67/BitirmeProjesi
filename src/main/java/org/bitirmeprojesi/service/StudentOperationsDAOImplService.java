/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitirmeprojesi.service;

import java.io.Serializable;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;
import org.bitirmeprojesi.dao.StudentOperationsDAO;
import org.bitirmeprojesi.entity.Student;

/**
 *
 * @author Batuhan
 */
@Stateful
public class StudentOperationsDAOImplService implements Serializable {

    @Inject
    private @Named("studentOperationsDAO")
    transient StudentOperationsDAO studentOperationsDAO;

    public boolean insertStudentFromService(Student student) {
        try {
            studentOperationsDAO.addStudent(student);
            return true;
        } catch (Exception e) {
            System.out.println("Error from StudentOperationsDAOImplService:" + e.getLocalizedMessage());
        }
        return false;
    }

}
