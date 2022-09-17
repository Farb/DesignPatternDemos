using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace NetDesignPatternDemos.AbstractFactory.Demo1.Tests
{
    [TestClass()]
    public class IosFactoryTests
    {
        [TestMethod()]
        public void CreateControllerTest()
        {
            IAbstractFactory factory = new IosFactory();
            IInterfaceController interfaceController = factory.CreateInterfaceController();
            IOperationController operationController = factory.CreateOperationController();
            Assert.IsTrue(interfaceController is IosInterfaceController);
            Assert.IsTrue(operationController is IosOperationController);
            interfaceController.Init();
            operationController.Init();
        }
    }
}