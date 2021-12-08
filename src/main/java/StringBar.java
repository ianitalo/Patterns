public class StringBar extends Bar
{
    private boolean ishappy;
    public StringBar(){ishappy = false;}
    @Override
    public boolean isHappyHour() {
        return ishappy;
    }
    @Override
    public void startHappyHour()
    {
        ishappy = true;
        notifyObservers();
    }
    @Override
    public void endHappyHour() {
        ishappy = false;
        notifyObservers();
    }
    public void order(StringDrink drink,StringRecipe recipe)
    {
        recipe.mix(drink);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
