public class AllDevices {

    String getInfo (Device device){

        String getInfo = device.code + "\n" + device.producer + "\n" + device.type + "\n" + device.price;
        return getInfo;

    }

}
