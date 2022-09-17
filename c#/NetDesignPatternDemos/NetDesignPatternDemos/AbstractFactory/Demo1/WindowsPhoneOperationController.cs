namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class WindowsPhoneOperationController : IOperationController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(WindowsPhoneOperationController)} Init...");
    }
}
