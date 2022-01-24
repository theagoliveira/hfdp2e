package factories;

import ingredients.BlackOlives;
import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.EggPlant;
import ingredients.FrozenClams;
import ingredients.MozzarellaCheese;
import ingredients.Pepperoni;
import ingredients.PlumTomatoSauce;
import ingredients.Sauce;
import ingredients.SlicedPepperoni;
import ingredients.Spinach;
import ingredients.ThickCrustDough;
import ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

}
