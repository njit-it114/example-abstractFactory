/**
 * 
 */
package com.mycompany.example_abstractFactory.factory;

import com.mycompany.example_abstractFactory.apple.Apple;
import com.mycompany.example_abstractFactory.apple.GreenApple;
import com.mycompany.example_abstractFactory.apple.RedApple;
import com.mycompany.example_abstractFactory.common.AppleType;
import com.mycompany.example_abstractFactory.common.OrangeType;
import com.mycompany.example_abstractFactory.orange.Orange;

/**
 * @author ilker
 *
 */
public class AppleFruitFactory extends FruitFactory {

	/*(non-Javadoc)
	 * @see com.mycompany.example_abstractFactory.factory.FruitFactory#createApple(com.mycompany.example_abstractFactory.common.AppleType)
	 */
	@Override
	public Apple createApple(AppleType appleType) {
		Apple retVal = null;
		
		switch (appleType) {
		case GreenApple:
			retVal = new GreenApple();
			break;

		case RedApple:
			retVal = new RedApple();
			break;
		
		default:
			break;
		}
		return retVal;
	}

	/**
	 *  (non-Javadoc)
	 * @see com.mycompany.example_abstractFactory.factory.FruitFactory#createOrange(com.mycompany.example_abstractFactory.common.OrangeType)
	 * @return null as this factory is only for Apple, not for Orange
	 */
	@Override
	public Orange createOrange(OrangeType orangeType) {
		return null;
	}

}
