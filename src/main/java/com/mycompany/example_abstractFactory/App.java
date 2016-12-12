package com.mycompany.example_abstractFactory;

import com.mycompany.example_abstractFactory.apple.Apple;
import com.mycompany.example_abstractFactory.common.AppleType;
import com.mycompany.example_abstractFactory.common.FruitFactoryType;
import com.mycompany.example_abstractFactory.common.OrangeType;
import com.mycompany.example_abstractFactory.factory.FruitFactory;
import com.mycompany.example_abstractFactory.factory.FruitFactoryProducer;
import com.mycompany.example_abstractFactory.orange.Orange;

/**
 * Factory Design pattern usage
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "BEF App::main(.)" );
        useFruitFactories();
        System.out.println( "EOF App::main(.)" );
    }
    
    private static void useFruitFactories() {
    	System.out.println( "BEF App::useFruitFactories()" );
    	
        // create Apple factory via Factory producer
        FruitFactory fruitFactory = FruitFactoryProducer.createFruitFactory(FruitFactoryType.AppleFruitFactory);
        
        Apple apple;
        //  create green Apple instance via apple factory and execute its slice method
        apple = fruitFactory.createApple(AppleType.GreenApple);
        apple.slice();
        
        //  create red Apple instance via apple factory and execute its slice method
        apple = fruitFactory.createApple(AppleType.RedApple);
        apple.slice();
        
        // create Apple factory via Factory producer
        fruitFactory = FruitFactoryProducer.createFruitFactory(FruitFactoryType.OrangeFruitFactory);
        
        Orange orange;
        // create blood Orange instance via apple factory and execute its squize method
        orange = fruitFactory.createOrange(OrangeType.BloodOrange);
        orange.squize();
        
        // create red Orange instance via apple factory and execute its squize method
        orange = fruitFactory.createOrange(OrangeType.RedOrange);
        orange.squize();

        //  create valencine Orange instance via apple factory and execute its squize method
        orange = fruitFactory.createOrange(OrangeType.ValencineOrange);
        orange.squize();
        
        System.out.println( "EOF App::useFruitFactories()" );
    }
    
}
