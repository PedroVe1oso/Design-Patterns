public class SmartStrategy implements OrderingStrategy{
    Boolean order = false;
    StringRecipe recipe;
    StringDrink drink;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        if(order || bar.isHappyHour()) bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        wants(drink, recipe, bar);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
