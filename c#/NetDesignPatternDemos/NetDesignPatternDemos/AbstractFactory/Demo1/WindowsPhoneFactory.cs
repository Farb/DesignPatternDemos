namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public class WindowsPhoneFactory : IAbstractFactory
{
    public IInterfaceController CreateInterfaceController()
    {
        return new WindowsPhoneInterfaceController();
    }

    public IOperationController CreateOperationController()
    {
        return new WindowsPhoneOperationController();
    }
}
