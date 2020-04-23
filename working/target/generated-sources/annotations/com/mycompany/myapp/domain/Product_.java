package com.mycompany.myapp.domain;

import com.mycompany.myapp.domain.enumeration.Disponibility;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SetAttribute<Product, Basket> baskets;
	public static volatile SingularAttribute<Product, Long> productId;
	public static volatile SingularAttribute<Product, BigDecimal> price;
	public static volatile SingularAttribute<Product, Restaurant> restaurant;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile SingularAttribute<Product, Disponibility> disponibility;

	public static final String BASKETS = "baskets";
	public static final String PRODUCT_ID = "productId";
	public static final String PRICE = "price";
	public static final String RESTAURANT = "restaurant";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String DISPONIBILITY = "disponibility";

}

