namespace NetDesignPatternDemos.FactoryMehod.Demo1;
public class Client
{
    public static IChart GetChart()
    {
        // 假设BarChartFactory可以从配置文件+反射创建工厂类
        ChartFactory factory = new BarChartFactory();
        return factory.CreateChart();
    }
}
