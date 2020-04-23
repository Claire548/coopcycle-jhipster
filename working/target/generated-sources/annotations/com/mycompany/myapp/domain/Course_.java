package com.mycompany.myapp.domain;

import com.mycompany.myapp.domain.enumeration.DeliveryState;
import com.mycompany.myapp.domain.enumeration.PaymentMethod;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, Basket> basketId;
	public static volatile SingularAttribute<Course, Instant> estimatedPreparationTime;
	public static volatile SingularAttribute<Course, Instant> deliveryTime;
	public static volatile SingularAttribute<Course, Instant> estimatedDeliveryTime;
	public static volatile SingularAttribute<Course, Restaurant> restaurant;
	public static volatile SingularAttribute<Course, Instant> preparationTime;
	public static volatile SingularAttribute<Course, PaymentMethod> paymentMethod;
	public static volatile SingularAttribute<Course, Long> id;
	public static volatile SingularAttribute<Course, DeliveryState> state;
	public static volatile SingularAttribute<Course, User> deliverer;
	public static volatile SingularAttribute<Course, Long> courseId;
	public static volatile SingularAttribute<Course, User> customer;

	public static final String BASKET_ID = "basketId";
	public static final String ESTIMATED_PREPARATION_TIME = "estimatedPreparationTime";
	public static final String DELIVERY_TIME = "deliveryTime";
	public static final String ESTIMATED_DELIVERY_TIME = "estimatedDeliveryTime";
	public static final String RESTAURANT = "restaurant";
	public static final String PREPARATION_TIME = "preparationTime";
	public static final String PAYMENT_METHOD = "paymentMethod";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String DELIVERER = "deliverer";
	public static final String COURSE_ID = "courseId";
	public static final String CUSTOMER = "customer";

}

