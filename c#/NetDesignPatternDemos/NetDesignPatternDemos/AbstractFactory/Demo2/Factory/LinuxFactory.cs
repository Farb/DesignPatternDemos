using NetDesignPatternDemos.AbstractFactory.Demo2.AbstractProduct;
using NetDesignPatternDemos.AbstractFactory.Demo2.ConcreteProduct;

namespace NetDesignPatternDemos.AbstractFactory.Demo2.Factory;
public class LinuxFactory : IAbstractFactory
{
    public IButton CreateButton()
    {
        return new LinuxButton();
    }

    public IText CreateText()
    {
        return new LinuxText();
    }
}
