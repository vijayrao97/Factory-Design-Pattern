package Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform){
            case ANDROID -> new AndriodUIFactory();
            case IOS -> new IosUIFactory();
            case MAC -> new MacUIFactory();
        };
    }
}
