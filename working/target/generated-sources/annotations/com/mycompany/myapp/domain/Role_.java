package com.mycompany.myapp.domain;

import com.mycompany.myapp.domain.enumeration.RoleOption;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile SingularAttribute<Role, RoleOption> role;
	public static volatile SetAttribute<Role, User> accountIds;
	public static volatile SingularAttribute<Role, Long> id;

	public static final String ROLE = "role";
	public static final String ACCOUNT_IDS = "accountIds";
	public static final String ID = "id";

}

