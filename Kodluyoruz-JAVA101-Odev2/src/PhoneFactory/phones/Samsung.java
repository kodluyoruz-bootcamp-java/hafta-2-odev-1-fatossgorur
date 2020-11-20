package PhoneFactory.phones;

import PhoneFactory.interfaces.ISamsung;
import PhoneFactory.phones.Phone;

public class Samsung extends Phone implements ISamsung {

    private KeyKeyboard keyboard = new KeyKeyboard();

    public Samsung() {
    }

    public Samsung(String modelName, String IMEI, String versionNo, double memoryCapacity, double screenSize) {
        super(modelName, IMEI, versionNo, memoryCapacity, screenSize);
    }

    @Override
    public void call() {
        System.out.println("Samsung ile arama yapabiliyorsunuz.");
    }

    @Override
    public void sendSms() {
        System.out.println("Samsung ile mesaj gönderebiliyorsunuz.");
    }

    @Override
    public void fileSharing() {
        System.out.println("Samsung ile dosya paylaşımı yapabiliyorsunuz.");
    }

    @Override
    public void listenTomp3() {
        System.out.println("Samsung ile mp3 dinleyebiliyorsunuz.");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(" Keyboard type: "+keyboard.getKeyboardType());
    }


}
