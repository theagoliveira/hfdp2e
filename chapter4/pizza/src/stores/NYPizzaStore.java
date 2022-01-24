package stores;

import factories.NYPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;

            default:
                break;
        }

        return pizza;
    }

}
