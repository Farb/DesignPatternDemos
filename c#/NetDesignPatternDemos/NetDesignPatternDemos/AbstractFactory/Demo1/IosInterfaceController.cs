namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class IosInterfaceController : IInterfaceController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(IosInterfaceController)} Init...");
    }
}
