package com.capgemini.angularassignment.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_primary")
public class ProductPrimary implements Serializable{
	@Id
	@Column
	private String productName;
	@Column
	private String imageUrl;
	@Column
	private double price;
	@Column
	private String productDescription;
}
