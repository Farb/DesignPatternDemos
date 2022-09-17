namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class IosFactory : IAbstractFactory
{
    public IInterfaceController CreateInterfaceController()
    {
        return new IosInterfaceController();
    }

    public IOperationController CreateOperationController()
    {
        return new IosOperationController();
    }
}
