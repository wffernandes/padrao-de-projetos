package br.com.cod3r.builder.spolleto.model.builder;

import br.com.cod3r.builder.spolleto.model.Salad;

public class SaladBuilder extends MealBuilderOpt {
    public Salad getResult() {
        return new Salad(toppings, sauces, size, cheese, pepper);
    }
}
