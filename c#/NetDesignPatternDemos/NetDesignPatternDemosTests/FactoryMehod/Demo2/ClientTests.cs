using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace NetDesignPatternDemos.FactoryMehod.Demo2.Tests
{
    [TestClass()]
    public class ClientTests
    {
        [TestMethod()]
        public void GetImageReaderTest()
        {
            IImageReader reader = Client.GetImageReader();
            Assert.IsTrue(reader is GifReader);
            reader.Read();
        }
    }
}