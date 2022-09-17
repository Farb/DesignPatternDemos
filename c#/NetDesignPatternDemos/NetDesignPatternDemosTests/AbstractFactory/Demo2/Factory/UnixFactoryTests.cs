using Microsoft.VisualStudio.TestTools.UnitTesting;
using NetDesignPatternDemos.AbstractFactory.Demo2.AbstractProduct;
using NetDesignPatternDemos.AbstractFactory.Demo2.ConcreteProduct;

namespace NetDesignPatternDemos.AbstractFactory.Demo2.Factory.Tests
{
    [TestClass()]
    public class UnixFactoryTests
    {
        [TestMethod()]
        public void CreateTest()
        {
            IAbstractFactory factory = new UnixFactory();
            IButton button = factory.CreateButton();
            IText text = factory.CreateText();
            Assert.IsTrue(button is UnixButton);
            Assert.IsTrue(text is UnixText);
        }
    }
}