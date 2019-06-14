package sbd.digital.accelerator;

public class DeviceContext {
    private DeviceState state;

    public DeviceContext() {
        this.state = new CPU();
    }

    public void setDevice(DeviceState device){
        this.state = device;
    }

    public void currentState(){
        System.out.println(this.state.getDevice(this));
    }
}
