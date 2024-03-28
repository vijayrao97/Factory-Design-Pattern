package Factory;

import Factory.Components.button.Button;
import Factory.Components.button.MacButton;
import Factory.Components.dropdown.DropDown;
import Factory.Components.dropdown.MacDropDown;
import Factory.Components.menu.AndriodMenu;
import Factory.Components.menu.MacMenu;
import Factory.Components.menu.Menu;

public class MacUIFactory implements UIFactory{

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
