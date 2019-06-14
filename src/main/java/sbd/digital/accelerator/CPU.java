package sbd.digital.accelerator;

class CPU implements DeviceState{

    @Override
    public String getDevice(DeviceContext context) {
        return "Device: CPU";
    }
}
