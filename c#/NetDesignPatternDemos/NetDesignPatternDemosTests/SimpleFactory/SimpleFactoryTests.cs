using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace NetDesignPatternDemos.SimpleFactory.Tests
{
    [TestClass()]
    public class SimpleFactoryTests
    {
        [TestMethod()]
        public void CreateProductTest()
        {
            IProduct product = SimpleFactory.CreateProduct('A');
            Assert.IsTrue(product is ProductA);
            product.Process();
        }
    }
}