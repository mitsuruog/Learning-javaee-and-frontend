/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mitsuruog.javaee.frontend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mitsuruog
 */
@Entity
@Table(name = "CUSTOMER_ORDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerOrder.findAll", query = "SELECT c FROM CustomerOrder c"),
    @NamedQuery(name = "CustomerOrder.findById", query = "SELECT c FROM CustomerOrder c WHERE c.id = :id"),
    @NamedQuery(name = "CustomerOrder.findByCustomerId", query = "SELECT c FROM CustomerOrder c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "CustomerOrder.findByAmount", query = "SELECT c FROM CustomerOrder c WHERE c.amount = :amount"),
    @NamedQuery(name = "CustomerOrder.findByCreateDate", query = "SELECT c FROM CustomerOrder c WHERE c.createDate = :createDate")})
public class CustomerOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AMOUNT")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public CustomerOrder() {
    }

    public CustomerOrder(Integer id) {
        this.id = id;
    }

    public CustomerOrder(Integer id, int customerId, int amount, Date createDate) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        if (!(object instanceof CustomerOrder)) {
            return false;
        }
        CustomerOrder other = (CustomerOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mitsuruog.javaee.frontend.model.CustomerOrder[ id=" + id + " ]";
    }
    
}
