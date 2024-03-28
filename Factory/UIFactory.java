package Factory;

import Factory.Components.button.Button;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
