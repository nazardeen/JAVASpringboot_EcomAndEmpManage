package com.techmart.sales.model;

/*import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;*/

/**
 * A order model.
 *//*
@Entity
@Table(name = "orders")
public class Test  {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne
@JsonIgnoreProperties("")
private Customer customer;

@ManyToOne
@JsonIgnoreProperties("")
private Product product;

@NotNull
@Min(0)
@Column(nullable = false)
private Integer quantity;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Customer getCustomer() {
    return customer;
}

public void setCustomer(Customer customer) {
    this.customer = customer;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public Integer getQuantity() {
    return quantity;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

@Override
public boolean equals(Object o) {
    if (this == o)
        return true;

    if (o == null || getClass() != o.getClass())
        return false;

    Order order = (Order) o;

    return !(order.getId() == null || getId() == null) && Objects.equals(getId(), order.getId());
}

@Override
public int hashCode() {
    return Objects.hashCode(getId());
}

@Override
public String toString() {
    return "Order{" +
            "id=" + id +
            ", customer=" + customer +
            ", product=" + product +
            ", quantity=" + quantity +
            '}';
}*/