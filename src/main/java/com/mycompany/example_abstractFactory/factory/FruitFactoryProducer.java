/**
 * 
 */
package com.mycompany.example_abstractFactory.factory;

import com.mycompany.example_abstractFactory.common.FruitFactoryType;

/**
 * @author ilker
 *
 */
public class FruitFactoryProducer {
	/**
	 * Factory method to return a concrete FruitFactory specified by fruitFactoryType
	 * @param fruitFactoryType type of FruitFactory to return
	 * @return concrete implementation of {@link com.mycompany.example_abstractFactory.factory.FruitFactory}
	 */
	public static FruitFactory createFruitFactory(FruitFactoryType fruitFactoryType) {
		FruitFactory retVal = null;
				
		switch (fruitFactoryType) {
		case AppleFruitFactory:
			retVal = new AppleFruitFactory();
			break;

		case OrangeFruitFactory:
			retVal = new OrangeFruitFactory();
			break;

		default:
			break;
		}
		
		return retVal;
	}
}
