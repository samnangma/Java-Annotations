@SmartPhone
public class Application {
    public static void main(String[] args) {
        ApplePhone applePhone = new ApplePhone();
        applePhone.setCode(168);
        applePhone.setModal("Iphone 14 pro max");
        applePhone.setYear(2023);
        applePhone.setBlueBooth(new AppleBluetooth("203.201.25.89"));


        Class<?> clazz = applePhone.getClass();
        if (clazz.isAnnotationPresent(SmartPhone.class)){
            System.out.print("this object is smartphone ");
        }
    }
}
