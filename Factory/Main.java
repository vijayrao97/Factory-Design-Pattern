package Factory;

import Factory.Components.button.Button;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.Menu;

public class Main {
    public static void main(String[] args){
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}
