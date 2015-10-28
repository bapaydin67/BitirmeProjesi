/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bitirmeprojesi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Batuhan
 */
@Entity
@Table(name = "student_assesment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentAssesment.findAll", query = "SELECT s FROM StudentAssesment s"),
    @NamedQuery(name = "StudentAssesment.findBySAId", query = "SELECT s FROM StudentAssesment s WHERE s.sAId = :sAId"),
    @NamedQuery(name = "StudentAssesment.findBySAAssignmentScore", query = "SELECT s FROM StudentAssesment s WHERE s.sAAssignmentScore = :sAAssignmentScore"),
    @NamedQuery(name = "StudentAssesment.findBySATestCorrectAnswer", query = "SELECT s FROM StudentAssesment s WHERE s.sATestCorrectAnswer = :sATestCorrectAnswer"),
    @NamedQuery(name = "StudentAssesment.findBySATestWrongAnswer", query = "SELECT s FROM StudentAssesment s WHERE s.sATestWrongAnswer = :sATestWrongAnswer"),
    @NamedQuery(name = "StudentAssesment.findBySAAssignmentDeliveryDate", query = "SELECT s FROM StudentAssesment s WHERE s.sAAssignmentDeliveryDate = :sAAssignmentDeliveryDate"),
    @NamedQuery(name = "StudentAssesment.findBySATestDeliveryDate", query = "SELECT s FROM StudentAssesment s WHERE s.sATestDeliveryDate = :sATestDeliveryDate")})
public class StudentAssesment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_Id")
    private Integer sAId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_AssignmentScore")
    private short sAAssignmentScore;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_TestCorrectAnswer")
    private short sATestCorrectAnswer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_TestWrongAnswer")
    private short sATestWrongAnswer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_AssignmentDeliveryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sAAssignmentDeliveryDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SA_TestDeliveryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sATestDeliveryDate;
    @JoinColumn(name = "SA_TestId", referencedColumnName = "Test_Id")
    @ManyToOne(optional = false)
    private Test sATestId;
    @JoinColumn(name = "SA_StudentId", referencedColumnName = "Student_Id")
    @ManyToOne(optional = false)
    private Student sAStudentId;
    @JoinColumn(name = "SA_AssignmentId", referencedColumnName = "Assignment_Id")
    @ManyToOne(optional = false)
    private Assignment sAAssignmentId;

    public StudentAssesment() {
    }

    public StudentAssesment(Integer sAId) {
        this.sAId = sAId;
    }

    public StudentAssesment(Integer sAId, short sAAssignmentScore, short sATestCorrectAnswer, short sATestWrongAnswer, Date sAAssignmentDeliveryDate, Date sATestDeliveryDate) {
        this.sAId = sAId;
        this.sAAssignmentScore = sAAssignmentScore;
        this.sATestCorrectAnswer = sATestCorrectAnswer;
        this.sATestWrongAnswer = sATestWrongAnswer;
        this.sAAssignmentDeliveryDate = sAAssignmentDeliveryDate;
        this.sATestDeliveryDate = sATestDeliveryDate;
    }

    public Integer getSAId() {
        return sAId;
    }

    public void setSAId(Integer sAId) {
        this.sAId = sAId;
    }

    public short getSAAssignmentScore() {
        return sAAssignmentScore;
    }

    public void setSAAssignmentScore(short sAAssignmentScore) {
        this.sAAssignmentScore = sAAssignmentScore;
    }

    public short getSATestCorrectAnswer() {
        return sATestCorrectAnswer;
    }

    public void setSATestCorrectAnswer(short sATestCorrectAnswer) {
        this.sATestCorrectAnswer = sATestCorrectAnswer;
    }

    public short getSATestWrongAnswer() {
        return sATestWrongAnswer;
    }

    public void setSATestWrongAnswer(short sATestWrongAnswer) {
        this.sATestWrongAnswer = sATestWrongAnswer;
    }

    public Date getSAAssignmentDeliveryDate() {
        return sAAssignmentDeliveryDate;
    }

    public void setSAAssignmentDeliveryDate(Date sAAssignmentDeliveryDate) {
        this.sAAssignmentDeliveryDate = sAAssignmentDeliveryDate;
    }

    public Date getSATestDeliveryDate() {
        return sATestDeliveryDate;
    }

    public void setSATestDeliveryDate(Date sATestDeliveryDate) {
        this.sATestDeliveryDate = sATestDeliveryDate;
    }

    public Test getSATestId() {
        return sATestId;
    }

    public void setSATestId(Test sATestId) {
        this.sATestId = sATestId;
    }

    public Student getSAStudentId() {
        return sAStudentId;
    }

    public void setSAStudentId(Student sAStudentId) {
        this.sAStudentId = sAStudentId;
    }

    public Assignment getSAAssignmentId() {
        return sAAssignmentId;
    }

    public void setSAAssignmentId(Assignment sAAssignmentId) {
        this.sAAssignmentId = sAAssignmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sAId != null ? sAId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentAssesment)) {
            return false;
        }
        StudentAssesment other = (StudentAssesment) object;
        if ((this.sAId == null && other.sAId != null) || (this.sAId != null && !this.sAId.equals(other.sAId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.bitirmeprojesi.entity.StudentAssesment[ sAId=" + sAId + " ]";
    }
    
}
