package stores;

import factories.ChicagoPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;

            default:
                break;
        }

        return pizza;
    }

}
