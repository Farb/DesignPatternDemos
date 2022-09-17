namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class IosOperationController : IOperationController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(IosOperationController)} Init...");
    }
}
