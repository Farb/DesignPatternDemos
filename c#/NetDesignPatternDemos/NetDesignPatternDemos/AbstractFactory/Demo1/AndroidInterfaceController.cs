namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class AndroidInterfaceController : IInterfaceController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(AndroidInterfaceController)} Init...");
    }
}
