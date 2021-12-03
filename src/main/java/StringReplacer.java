public class StringReplacer implements StringTransformer
{
    char a,b;
    public StringReplacer(char c, char d)
    {
        a = c;
        b = d;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(a,b));
    }
}
