using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace NetDesignPatternDemos.FactoryMehod.Demo1.Tests;

[TestClass()]
public class ClientTests
{
    [TestMethod()]
    public void GetChartTest()
    {
        IChart chart = Client.GetChart();
        Assert.IsTrue(chart is BarChart);
        chart.Draw();
    }
}