import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy
{
    List<StringDrink> a = new ArrayList<StringDrink>();
    List<StringRecipe> b = new ArrayList<StringRecipe>();
    List<StringBar> c = new ArrayList<StringBar>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar)
    {
        if(!bar.isHappyHour())
        {
            a.add(drink);
            b.add(recipe);
            c.add(bar);
        }
        else
        {
            bar.order(drink,recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i = 0; i < a.size() ; i++)
        {
            bar.order(a.get(i),b.get(i));
        }
        a.clear();
        b.clear();
    }
    public void happyHourStarted(Bar bar) {
        for(int i = 0; i < a.size() ; i++)
        {
            c.get(i).order(a.get(i),b.get(i));
        }
        c.clear();
        a.clear();
        b.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
