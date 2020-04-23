package com.mycompany.myapp.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cooperative.class)
public abstract class Cooperative_ {

	public static volatile SingularAttribute<Cooperative, String> area;
	public static volatile SetAttribute<Cooperative, User> adminsys;
	public static volatile SingularAttribute<Cooperative, User> dg;
	public static volatile SingularAttribute<Cooperative, Long> cooperativeId;
	public static volatile SingularAttribute<Cooperative, String> name;
	public static volatile SetAttribute<Cooperative, Restaurant> restaurants;
	public static volatile SingularAttribute<Cooperative, Long> id;
	public static volatile SetAttribute<Cooperative, User> admincoops;

	public static final String AREA = "area";
	public static final String ADMINSYS = "adminsys";
	public static final String DG = "dg";
	public static final String COOPERATIVE_ID = "cooperativeId";
	public static final String NAME = "name";
	public static final String RESTAURANTS = "restaurants";
	public static final String ID = "id";
	public static final String ADMINCOOPS = "admincoops";

}

