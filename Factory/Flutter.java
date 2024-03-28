package Factory;

import java.sql.SQLOutput;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setRefreshRate(){
        // Dummy functions
        System.out.println("Refresh Rate is set");
    }

    public void theme(){
        // Dummy functions
        System.out.println("Theme is set");
    }

    public void collectData(){
        // Dummy functions
        System.out.println("Data is being collected");
    }

    public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }

}
