namespace NetDesignPatternDemos.SimpleFactory;
public class SimpleFactory
{
    public static IProduct CreateProduct(char arg)
    {
        if (arg == 'A')
        {
            return new ProductA();
        }
        if (arg == 'B')
        {
            return new ProductB();
        }
        throw new ArgumentException($"{arg} is not valid.");
    }
}
