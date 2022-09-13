namespace NetDesignPatternDemos.FactoryMehod.Demo1
{
    public class BarChartFactory : ChartFactory
    {
        public override IChart CreateChart()
        {
            return new BarChart();
        }
    }
}
