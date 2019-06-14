package sbd.digital.accelerator;

class GPU implements DeviceState {


    @Override
    public String getDevice(DeviceContext context) {
        return "Device GPU";
    }
}