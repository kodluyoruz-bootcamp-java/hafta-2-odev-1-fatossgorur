package PhoneFactory.phones;

import PhoneFactory.interfaces.IKeyboard;

public class KeyKeyboard implements IKeyboard {
    private String keyboardType = "Key Keyboard";
    @Override
    public String getKeyboardType() {
        return keyboardType;
    }
}
