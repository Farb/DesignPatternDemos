using NetDesignPatternDemos.AbstractFactory.Demo2.AbstractProduct;

namespace NetDesignPatternDemos.AbstractFactory.Demo2.Factory;
public interface IAbstractFactory
{
    public IButton CreateButton();
    public IText CreateText();
}
