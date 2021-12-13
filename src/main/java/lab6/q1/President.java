/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.q1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author maron
 */
@Entity
@Table(name = "president")
@NamedQueries({
    @NamedQuery(name = "President.findAll", query = "SELECT p FROM President p"),
    @NamedQuery(name = "President.findById", query = "SELECT p FROM President p WHERE p.id = :id"),
    @NamedQuery(name = "President.findByName", query = "SELECT p FROM President p WHERE p.name = :name"),
    @NamedQuery(name = "President.findByBirthday", query = "SELECT p FROM President p WHERE p.birthday = :birthday"),
    @NamedQuery(name = "President.findByGenre", query = "SELECT p FROM President p WHERE p.genre = :genre"),
    @NamedQuery(name = "President.findByEmail", query = "SELECT p FROM President p WHERE p.email = :email")})
public class President implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "birthday")
    private String birthday;
    @Column(name = "genre")
    private String genre;
    @Column(name = "email")
    private String email;

    public President() {
    }

    public President(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof President)) {
            return false;
        }
        President other = (President) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lab6.q1.President[ id=" + id + " ]";
    }
    
}
