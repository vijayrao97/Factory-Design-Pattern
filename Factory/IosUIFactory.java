package Factory;

import Factory.Components.button.Button;
import Factory.Components.button.IosButton;
import Factory.Components.dropdown.DropDown;
import Factory.Components.dropdown.IosDropDown;
import Factory.Components.menu.IosMenu;
import Factory.Components.menu.MacMenu;
import Factory.Components.menu.Menu;

public class IosUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
