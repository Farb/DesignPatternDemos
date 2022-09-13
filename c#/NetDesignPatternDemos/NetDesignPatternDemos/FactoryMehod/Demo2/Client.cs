namespace NetDesignPatternDemos.FactoryMehod.Demo2;
public class Client
{
    public static IImageReader GetImageReader()
    {
        ImageReaderFactory factory = new GifImageReaderFactory();
        IImageReader reader = factory.CreateImageReader();
        return reader;
    }
}
