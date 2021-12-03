public class StringCaseChanger implements StringTransformer
{
    String nova;
    @Override
    public void execute(StringDrink drink)
    {
        nova = "";
        for(int i = 0; i< drink.getText().length();i++)
        {
            if(Character.isLetter(drink.getText().charAt(i)))
            {
                if (Character.isLowerCase(drink.getText().charAt(i))) {
                    nova += Character.toUpperCase(drink.getText().charAt(i));
                } else {
                    nova += Character.toLowerCase(drink.getText().charAt(i));
                }
            }
            else
            {
                nova+= drink.getText().charAt(i);
            }
        }
        drink.setText(nova);
    }
}
