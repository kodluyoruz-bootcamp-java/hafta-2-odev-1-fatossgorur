package PhoneFactory.phones;

import PhoneFactory.interfaces.IApple;

public class Apple extends Phone implements IApple {

    private TouchKeyboard keyboard = new TouchKeyboard();

    public Apple() {
    }

    public Apple(String modelName, String IMEI, String versionNo, double memoryCapacity, double screenSize) {
        super(modelName, IMEI, versionNo, memoryCapacity, screenSize);
    }

    @Override
    public void call() {
        System.out.println("Apple ile arama yapabiliyorsunuz.");
    }

    @Override
    public void sendSms() {
        System.out.println("Apple ile mesaj gönderebiliyorsunuz.");
    }

    @Override
    public void openPhone()  {
        System.out.println("Apple ile telefonu açabilirsiniz.");
    }

    @Override
    public void closePhone()  {
        System.out.println("Apple ile telefonu kapatabilirsiniz.");
    }
    
    @Override
    public void videoCall() {
        System.out.println("Apple ile görüntülü arama yapabiliyorsunuz.");
    }

    @Override
    public void screenSharing() {
        System.out.println("Apple ile ekran paylaşımı yapabiliyorsunuz.");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(" Keyboard type: "+keyboard.getKeyboardType());

    }
}
