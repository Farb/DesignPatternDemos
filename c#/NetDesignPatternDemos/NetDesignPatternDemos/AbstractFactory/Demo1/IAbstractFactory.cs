namespace NetDesignPatternDemos.AbstractFactory.Demo1;
public interface IAbstractFactory
{
    public IOperationController CreateOperationController();
    public IInterfaceController CreateInterfaceController();
}
