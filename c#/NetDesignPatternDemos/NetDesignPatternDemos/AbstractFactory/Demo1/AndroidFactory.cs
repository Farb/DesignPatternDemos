namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class AndroidFactory : IAbstractFactory
{
    public IInterfaceController CreateInterfaceController()
    {
        return new AndroidInterfaceController();
    }

    public IOperationController CreateOperationController()
    {
        return new AndroidOperationController();
    }
}
