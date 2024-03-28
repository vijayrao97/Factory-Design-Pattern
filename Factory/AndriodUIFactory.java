package Factory;

import Factory.Components.button.AndriodButton;
import Factory.Components.button.Button;
import Factory.Components.dropdown.AndriodDropDown;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.AndriodMenu;
import Factory.Components.menu.Menu;

public class AndriodUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndriodDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
