namespace NetDesignPatternDemos.FactoryMehod.Demo1;

public class LineChartFactory : ChartFactory
{
    public override IChart CreateChart()
    {
        return new LineChart();
    }
}
