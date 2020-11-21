package PhoneFactory.phones;

public abstract class Phone {
    private String modelName;
    private String IMEI;
    private String versionNo;
    private double memoryCapacity;
    private double screenSize;
    private String keyboardType;

    public Phone() {
    }

    public Phone(String modelName, String IMEI, String versionNo, double memoryCapacity, double screenSize) {
        this.modelName = modelName;
        this.IMEI = IMEI;
        this.versionNo = versionNo;
        this.memoryCapacity = memoryCapacity;
        this.screenSize = screenSize;
    }

    public abstract void call();

    public abstract void sendSms();
    
    public abstract void openPhone();

    public abstract void closePhone();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void getInfo(){
        System.out.printf("Model name: " +getModelName()+" IMEI: "+getIMEI()+" Version no: "
                +getVersionNo()+" Memory: "+getMemoryCapacity()+" Screen size: "+getScreenSize());

    }
}
