package com.mycompany.myapp.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Restaurant.class)
public abstract class Restaurant_ {

	public static volatile SingularAttribute<Restaurant, User> owner;
	public static volatile SetAttribute<Restaurant, Cooperative> cooperatives;
	public static volatile SingularAttribute<Restaurant, String> name;
	public static volatile SingularAttribute<Restaurant, String> description;
	public static volatile SingularAttribute<Restaurant, Long> id;
	public static volatile SingularAttribute<Restaurant, Long> restaurantId;

	public static final String OWNER = "owner";
	public static final String COOPERATIVES = "cooperatives";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String RESTAURANT_ID = "restaurantId";

}

