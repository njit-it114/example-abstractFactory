/**
 * 
 */
package com.mycompany.example_abstractFactory.factory;

import com.mycompany.example_abstractFactory.apple.Apple;
import com.mycompany.example_abstractFactory.common.AppleType;
import com.mycompany.example_abstractFactory.common.OrangeType;
import com.mycompany.example_abstractFactory.orange.BloodOrange;
import com.mycompany.example_abstractFactory.orange.Orange;
import com.mycompany.example_abstractFactory.orange.RedOrange;
import com.mycompany.example_abstractFactory.orange.ValencineOrange;

/**
 * @author ilker
 *
 */
public class OrangeFruitFactory extends FruitFactory {

	/**
	 *  (non-Javadoc)
	 * @see com.mycompany.example_abstractFactory.factory.FruitFactory#createApple(com.mycompany.example_abstractFactory.common.AppleType)
	 * @return null as this factory is only for Orange, not for Apple
	 */
	@Override
	public Apple createApple(AppleType appleType) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.example_abstractFactory.factory.FruitFactory#createOrange(com.mycompany.example_abstractFactory.common.OrangeType)
	 */
	@Override
	public Orange createOrange(OrangeType orangeType) {
		Orange retVal = null;
		
		switch (orangeType) {
		case BloodOrange:
			retVal = new BloodOrange();
			break;

		case RedOrange:
			retVal = new RedOrange();
			break;

		case ValencineOrange:
			retVal = new ValencineOrange();
			break;
			
		default:
			break;
		}
		return retVal;
	}

}
