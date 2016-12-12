/**
 * 
 */
package com.mycompany.example_abstractFactory.factory;

import com.mycompany.example_abstractFactory.apple.Apple;
import com.mycompany.example_abstractFactory.common.AppleType;
import com.mycompany.example_abstractFactory.common.OrangeType;
import com.mycompany.example_abstractFactory.orange.Orange;

/**
 * @author ilker
 *
 */
public abstract class FruitFactory {
	public abstract Apple createApple(AppleType appleType);
	
	public abstract Orange createOrange(OrangeType orangeType);
}
