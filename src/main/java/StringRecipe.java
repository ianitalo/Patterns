import java.util.List;

public class StringRecipe
{
    List<StringTransformer> lista;
    public StringRecipe(List<StringTransformer> a)
    {
        lista = a;
    }
    public void mix(StringDrink s)
    {
        for(StringTransformer b:lista)
        {
            b.execute(s);
        }
    }
}
