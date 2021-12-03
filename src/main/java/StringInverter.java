import java.util.*;
public class StringInverter implements StringTransformer
{
    StringBuilder a = new StringBuilder();
    @Override
    public void execute(StringDrink drink)
    {
        a.append(drink.getText());
        a.reverse();
        drink.setText(a.toString());
    }
}
