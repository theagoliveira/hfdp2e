package stores;

import factories.CaliforniaPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("California Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;

            default:
                break;
        }

        return pizza;
    }

}
