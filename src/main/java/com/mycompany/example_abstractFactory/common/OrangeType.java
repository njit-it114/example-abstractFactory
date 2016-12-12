/**
 * 
 */
package com.mycompany.example_abstractFactory.common;

/**
 * @author ilker
 *
 */
public enum OrangeType {
	BloodOrange("blood"),
	RedOrange("red"),
	ValencineOrange("valencine");
	
	private String name;
	
	OrangeType(String _name) {
		name = _name;
	}
}
