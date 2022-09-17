namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class AndroidOperationController : IOperationController
{
    public void Init()
    {
        Console.WriteLine($"{nameof(AndroidOperationController)} Init...");
    }
}
