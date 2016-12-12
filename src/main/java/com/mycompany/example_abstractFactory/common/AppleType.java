/**
 * 
 */
package com.mycompany.example_abstractFactory.common;

/**
 * @author ilker
 *
 */
public enum AppleType {
	GreenApple("green"),
	RedApple("red");
	
	private String name;
	
	AppleType(String _name) {
		name = _name;
	}
}
