package composite;

public class BuildOrder {

    public static Component getOrder()
    {
//         Composite order = new Composite( "Order" ) ;
//         order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
//         order.addChild(new Leaf("The Purist", 8.00 ));
//         Composite customBurger = new Composite( "Build Your Own Burger" ) ;
//         customBurger.addChild(new Leaf("Beef, 1/3 lb on a Bun", 9.50 )); // base price for 1/3 lb
//         customBurger.addChild(new Leaf("Danish Blue Cheese", 0.00 )); // 1 cheese free, extra cheese +1.00
//         customBurger.addChild(new Leaf("Horseradish Cheddar", 1.00 )); // extra cheese +1.00
//         customBurger.addChild(new Leaf("Bermuda Red Onion", 0.00 )); // 4 toppings free, extra +.75
//         customBurger.addChild(new Leaf("Black Olives", 0.00 )); // 4 toppings free, extra +.75
//         customBurger.addChild(new Leaf("Carrot Strings", 0.00 )); // 4 toppings free, extra +.75
//         customBurger.addChild(new Leaf("Coleslaw", 0.00 )); // 4 toppings free, extra +.75
//         customBurger.addChild(new Leaf("Applewood Smoked Bacon", 1.50 )); // premium topping +1.50
//         customBurger.addChild(new Leaf("Appricot Sauce", 0.00 )); // 1 sauce free, extra +.75
//         order.addChild( customBurger );
//         return order ;
           Composite order = new Composite( "Order" ) ;
           CrispyOnionStrings crispy = new CrispyOnionStrings("Crispy Onion Strings",5.50);           
           ThePurist purist = new ThePurist("The Purist",8.00);
           CustomBurger customBurger = new CustomBurger("Build your own burger");
           String[] optionsBun = {"Beef","1/3lb.","On A Bun"};
           String[] optionsCheese = {"Danish Blue Cheese","Horseradish Cheddar"};
           String[] optionsToppings = {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"};
           String[] optionsPremTopp = {"Applewood Smoked Bacon"};
           String[] optionsSauce = {"Appricot Sauce"};
           //BurgerType burgertype = new BurgerType(options,customBurger);
           BurgerType b = new BurgerType();
           b.setOptions(optionsBun);           
           Cheese c = new Cheese();
           c.setOptions(optionsCheese);
           c.wrapDecorator(b);
           Toppings t = new Toppings();
           t.setOptions(optionsToppings);
           t.wrapDecorator(c);
           PremiumToppings pt = new PremiumToppings();
           pt.setOptions(optionsPremTopp);
           pt.wrapDecorator(t);
           Sauce s = new Sauce();
           s.setOptions(optionsSauce);
           s.wrapDecorator(pt);
           customBurger.addChild(b);
           customBurger.addChild(c);
           customBurger.addChild(t);
           customBurger.addChild(pt);
           customBurger.addChild(s);
           customBurger.setDecorator(s);
           order.addChild(crispy);
           //order.removeChild(crispy);
           order.addChild(purist);
           order.addChild(customBurger);
           
           //Cheese cheese = new Cheese();
           //customBurger.addChild()
           //Burger burger
        return order;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/