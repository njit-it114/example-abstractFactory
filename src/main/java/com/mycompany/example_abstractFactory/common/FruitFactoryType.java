/**
 * 
 */
package com.mycompany.example_abstractFactory.common;

/**
 * @author ilker
 *
 */
public enum FruitFactoryType {
	AppleFruitFactory("apple"),
	OrangeFruitFactory("orange");
	
	private String name;
	
	FruitFactoryType(String _name) {
		name = _name;
	}

}
