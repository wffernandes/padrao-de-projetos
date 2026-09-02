package br.com.cod3r.builder.spolleto.model.builder;


import br.com.cod3r.builder.spolleto.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {
    public Pasta getResult() {
        return new Pasta(toppings, sauces, size, cheese, pepper);
    }
}
