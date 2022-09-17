using NetDesignPatternDemos.AbstractFactory.Demo2.AbstractProduct;
using NetDesignPatternDemos.AbstractFactory.Demo2.ConcreteProduct;

namespace NetDesignPatternDemos.AbstractFactory.Demo2.Factory;
public class WindowsFactory : IAbstractFactory
{
    public IButton CreateButton()
    {
        return new WindowsButton();
    }

    public IText CreateText()
    {
        return new WindowsText();
    }
}
