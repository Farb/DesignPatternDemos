namespace NetDesignPatternDemos.FactoryMehod.Demo2;
public class JpgReaderFactory : ImageReaderFactory
{
    public override IImageReader CreateImageReader()
    {
        return new JpgReader();
    }
}
