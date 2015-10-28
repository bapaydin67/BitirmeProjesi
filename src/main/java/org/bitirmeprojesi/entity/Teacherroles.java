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
import javax.persistence.Id;
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
@Table(name = "teacherroles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacherroles.findAll", query = "SELECT t FROM Teacherroles t"),
    @NamedQuery(name = "Teacherroles.findById", query = "SELECT t FROM Teacherroles t WHERE t.id = :id"),
    @NamedQuery(name = "Teacherroles.findByLoginnumber", query = "SELECT t FROM Teacherroles t WHERE t.loginnumber = :loginnumber"),
    @NamedQuery(name = "Teacherroles.findByRole", query = "SELECT t FROM Teacherroles t WHERE t.role = :role")})
public class Teacherroles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "loginnumber")
    private String loginnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "role")
    private String role;

    public Teacherroles() {
    }

    public Teacherroles(Integer id) {
        this.id = id;
    }

    public Teacherroles(Integer id, String loginnumber, String role) {
        this.id = id;
        this.loginnumber = loginnumber;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginnumber() {
        return loginnumber;
    }

    public void setLoginnumber(String loginnumber) {
        this.loginnumber = loginnumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacherroles)) {
            return false;
        }
        Teacherroles other = (Teacherroles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.bitirmeprojesi.entity.Teacherroles[ id=" + id + " ]";
    }
    
}
