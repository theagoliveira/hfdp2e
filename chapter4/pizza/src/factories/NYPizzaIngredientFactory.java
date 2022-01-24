package factories;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.FreshClams;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.Mushroom;
import ingredients.Onion;
import ingredients.Pepperoni;
import ingredients.RedPepper;
import ingredients.ReggianoCheese;
import ingredients.Sauce;
import ingredients.SlicedPepperoni;
import ingredients.ThinCrustDough;
import ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}
