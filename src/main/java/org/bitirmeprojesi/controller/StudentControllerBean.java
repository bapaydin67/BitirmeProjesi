/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitirmeprojesi.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.bitirmeprojesi.entity.Student;
import org.bitirmeprojesi.entity.Teacher;
import org.bitirmeprojesi.service.StudentOperationsDAOImplService;
import org.bitirmeprojesi.service.TeacherOperationsDAOImplService;

/**
 *
 * @author Batuhan
 */
@ManagedBean(name = "studentControllerBean")
@ApplicationScoped
public class StudentControllerBean implements Serializable {

    private Student student = new Student();
    private List<Teacher> teacherList = new ArrayList<Teacher>();

    @EJB
    StudentOperationsDAOImplService studentOperationsDAOImplService;

    @EJB
    TeacherOperationsDAOImplService teacherOperationsDAOImplService;

    @PostConstruct
    public void init() {
        teacherList = teacherOperationsDAOImplService.getTeachersFromService();
    }

    public void insertStudentFromBean() {
        try {
            boolean control = studentOperationsDAOImplService.insertStudentFromService(student);
            if (control) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Student insert success!", null));
                student = new Student();
                setStudent(student);
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN, "Student insert fail!", null));
            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getLocalizedMessage(), null));
        }
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

}
