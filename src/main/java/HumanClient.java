public class HumanClient implements Client
{
    private OrderingStrategy b;
    public HumanClient(OrderingStrategy a)
    {
        b = a;
    }
    @Override
    public void happyHourStarted(Bar bar) {
        b.happyHourStarted((StringBar)bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {

    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        b.wants(drink,recipe,bar);
    }
}
