package org.example.container;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

/**
 * Type determined method invoking factory bean.
 *
 * https://issues.onehippo.com/browse/HSTTWO-3953
 */
public class TypeDeterminedMethodInvokingFactoryBean extends MethodInvokingFactoryBean {

	private Class<?> objectType;

	/**
	 * Instantiates a new Type determined method invoking factory bean.
	 *
	 * @param objectType the object type
	 */
	public TypeDeterminedMethodInvokingFactoryBean(final Class<?> objectType) {
		this.objectType = objectType;
	}

	@Override
	public Class<?> getObjectType() {
		return objectType;
	}
}