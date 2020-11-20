package PhoneFactory.phones;

import PhoneFactory.interfaces.IKeyboard;

public class TouchKeyboard implements IKeyboard {
    private String keyboardType = "Touch Keyboard";
    @Override
    public String getKeyboardType() {
        return keyboardType;
    }
}
