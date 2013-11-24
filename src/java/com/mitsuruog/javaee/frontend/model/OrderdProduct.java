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
@Table(name = "ORDERD_PRODUCT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderdProduct.findAll", query = "SELECT o FROM OrderdProduct o"),
    @NamedQuery(name = "OrderdProduct.findById", query = "SELECT o FROM OrderdProduct o WHERE o.id = :id"),
    @NamedQuery(name = "OrderdProduct.findByCustomerOrderId", query = "SELECT o FROM OrderdProduct o WHERE o.customerOrderId = :customerOrderId"),
    @NamedQuery(name = "OrderdProduct.findByProductId", query = "SELECT o FROM OrderdProduct o WHERE o.productId = :productId"),
    @NamedQuery(name = "OrderdProduct.findByQuantity", query = "SELECT o FROM OrderdProduct o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OrderdProduct.findByCreateDate", query = "SELECT o FROM OrderdProduct o WHERE o.createDate = :createDate")})
public class OrderdProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMER_ORDER_ID")
    private int customerOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTITY")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public OrderdProduct() {
    }

    public OrderdProduct(Integer id) {
        this.id = id;
    }

    public OrderdProduct(Integer id, int customerOrderId, int productId, int quantity, Date createDate) {
        this.id = id;
        this.customerOrderId = customerOrderId;
        this.productId = productId;
        this.quantity = quantity;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        if (!(object instanceof OrderdProduct)) {
            return false;
        }
        OrderdProduct other = (OrderdProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mitsuruog.javaee.frontend.model.OrderdProduct[ id=" + id + " ]";
    }
    
}
