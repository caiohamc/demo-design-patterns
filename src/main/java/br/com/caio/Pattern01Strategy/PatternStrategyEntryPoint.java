package br.com.caio.Pattern01Strategy;

import br.com.caio.Pattern01Strategy.classes.CityDuck;
import br.com.caio.Pattern01Strategy.classes.Duck;
import br.com.caio.Pattern01Strategy.classes.WildDuck;

public class PatternStrategyEntryPoint {
    public static void main(String[] args) {
        Duck sushi = new CityDuck();
        Duck joe = new WildDuck();

        System.out.println("Sushi (CityDuck):");
        System.out.println("- " + sushi.tryToDisplay());
        System.out.println("- " + sushi.tryToFly());
        System.out.println("- " + sushi.tryToQuack() + "\n");

        System.out.println("Joe (WildDuck):");
        System.out.println("- " + joe.tryToDisplay());
        System.out.println("- " + joe.tryToFly());
        System.out.println("- " + joe.tryToQuack());
    }
}
