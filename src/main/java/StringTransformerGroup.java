import java.util.List;

public class StringTransformerGroup implements StringTransformer
{
    List<StringTransformer> lista;
    public StringTransformerGroup(List<StringTransformer> a)
    {
        lista = a;
    }

    @Override
    public void execute(StringDrink drink)
    {
        for(StringTransformer b:lista)
        {
            b.execute(drink);
        }
    }
}
