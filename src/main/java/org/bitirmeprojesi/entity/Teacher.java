/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bitirmeprojesi.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Batuhan
 */
@Entity
@Table(name = "teacher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacher.findAll", query = "SELECT t FROM Teacher t"),
    @NamedQuery(name = "Teacher.findByTeacherTeacherId", query = "SELECT t FROM Teacher t WHERE t.teacherTeacherId = :teacherTeacherId"),
    @NamedQuery(name = "Teacher.findByTeacherName", query = "SELECT t FROM Teacher t WHERE t.teacherName = :teacherName"),
    @NamedQuery(name = "Teacher.findByTeacherSurname", query = "SELECT t FROM Teacher t WHERE t.teacherSurname = :teacherSurname"),
    @NamedQuery(name = "Teacher.findByTeacherLoginNumber", query = "SELECT t FROM Teacher t WHERE t.teacherLoginNumber = :teacherLoginNumber"),
    @NamedQuery(name = "Teacher.findByPassword", query = "SELECT t FROM Teacher t WHERE t.password = :password"),
    @NamedQuery(name = "Teacher.findByEnabled", query = "SELECT t FROM Teacher t WHERE t.enabled = :enabled")})
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Teacher_TeacherId")
    private Integer teacherTeacherId;
    @Basic(optional = false)
    @Size(min = 1, max = 20)
    @Column(name = "Teacher_Name")
    private String teacherName;
    @Basic(optional = false)
    @Size(min = 1, max = 20)
    @Column(name = "Teacher_Surname")
    private String teacherSurname;
    @Basic(optional = false)
    @Size(min = 1, max = 11)
    @Column(name = "Teacher_LoginNumber")
    private String teacherLoginNumber;
    @Basic(optional = false)
    @Size(min = 1, max = 100)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "enabled")
    private boolean enabled;
    @JoinColumn(name = "Teacher_SchoolId", referencedColumnName = "Schoold_Id")
    @ManyToOne(optional = false)
    private School teacherSchoolId;

    public Teacher() {
    }

    public Teacher(Integer teacherTeacherId) {
        this.teacherTeacherId = teacherTeacherId;
    }

    public Teacher(Integer teacherTeacherId, String teacherName, String teacherSurname, String teacherLoginNumber, String password, boolean enabled) {
        this.teacherTeacherId = teacherTeacherId;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherLoginNumber = teacherLoginNumber;
        this.password = password;
        this.enabled = enabled;
    }

    public Integer getTeacherTeacherId() {
        return teacherTeacherId;
    }

    public void setTeacherTeacherId(Integer teacherTeacherId) {
        this.teacherTeacherId = teacherTeacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherLoginNumber() {
        return teacherLoginNumber;
    }

    public void setTeacherLoginNumber(String teacherLoginNumber) {
        this.teacherLoginNumber = teacherLoginNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public School getTeacherSchoolId() {
        return teacherSchoolId;
    }

    public void setTeacherSchoolId(School teacherSchoolId) {
        this.teacherSchoolId = teacherSchoolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherTeacherId != null ? teacherTeacherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.teacherTeacherId == null && other.teacherTeacherId != null) || (this.teacherTeacherId != null && !this.teacherTeacherId.equals(other.teacherTeacherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.bitirmeprojesi.entity.Teacher[ teacherTeacherId=" + teacherTeacherId + " ]";
    }
    
}
