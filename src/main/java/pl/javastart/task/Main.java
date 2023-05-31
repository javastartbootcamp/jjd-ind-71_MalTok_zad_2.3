package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.containsAlcohol = true;

        drink1.component1 = new Component();
        drink1.component1.name = "woda";
        drink1.component1.amount = 120;

        drink1.component2 = new Component();
        drink1.component2.name = "sok cytrynowy";
        drink1.component2.amount = 30;

        drink1.component3 = new Component();
        drink1.component3.name = "wódka";
        drink1.component3.amount = 60;

        int componentsTotalAmount = drink1.component1.amount + drink1.component2.amount + drink1.component3.amount;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.containsAlcohol);
        System.out.println("Składniki:");
        System.out.printf("%s\n%s\n%s\n", drink1.component1.name, drink1.component2.name, drink1.component3.name);
        System.out.println("Pojemność: " + componentsTotalAmount + "ml");
    }
}
