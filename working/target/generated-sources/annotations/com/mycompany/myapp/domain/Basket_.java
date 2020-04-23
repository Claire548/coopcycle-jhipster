package com.mycompany.myapp.domain;

import com.mycompany.myapp.domain.enumeration.BasketState;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Basket.class)
public abstract class Basket_ {

	public static volatile SingularAttribute<Basket, BasketState> basketState;
	public static volatile SingularAttribute<Basket, Long> basketId;
	public static volatile SingularAttribute<Basket, Course> orderId;
	public static volatile SingularAttribute<Basket, Long> id;
	public static volatile SetAttribute<Basket, Product> products;

	public static final String BASKET_STATE = "basketState";
	public static final String BASKET_ID = "basketId";
	public static final String ORDER_ID = "orderId";
	public static final String ID = "id";
	public static final String PRODUCTS = "products";

}

