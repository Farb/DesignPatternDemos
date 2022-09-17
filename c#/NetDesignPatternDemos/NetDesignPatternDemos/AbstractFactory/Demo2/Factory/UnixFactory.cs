using NetDesignPatternDemos.AbstractFactory.Demo2.AbstractProduct;
using NetDesignPatternDemos.AbstractFactory.Demo2.ConcreteProduct;

namespace NetDesignPatternDemos.AbstractFactory.Demo2.Factory;
public class UnixFactory : IAbstractFactory
{
    public IButton CreateButton()
    {
        return new UnixButton();
    }

    public IText CreateText()
    {
        return new UnixText();
    }
}
