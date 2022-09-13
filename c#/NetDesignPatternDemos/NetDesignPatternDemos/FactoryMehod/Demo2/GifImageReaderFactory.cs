namespace NetDesignPatternDemos.FactoryMehod.Demo2;
public class GifImageReaderFactory : ImageReaderFactory
{
    public override IImageReader CreateImageReader()
    {
        return new GifReader();
    }
}
