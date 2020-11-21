package PhoneFactory.phones;

public class Main {
    public static void main(String[] args) {

        Samsung s20 = new Samsung("Samsung S20","TR444555","IC87PL09",32000,6.2);
        Apple iphone11 = new Apple("Iphone 11","TR111222","WE80YU62",32000,6.1);

        s20.getInfo();
        iphone11.getInfo();

        s20.call();
        s20.openPhone();
        s20.closePhone();
        s20.sendSms();
        s20.fileSharing();
        s20.listenTomp3();

        iphone11.call();
        iphone11.openPhone();
        iphone11.closePhone();
        iphone11.sendSms();
        iphone11.videoCall();
        iphone11.screenSharing();


    }
}
