namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class WindowsPhoneInterfaceController : IInterfaceController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(WindowsPhoneInterfaceController)} Init...");
    }
}
