package sbd.digital.accelerator;

public class StateDesignPattern {
    public static void main(String args[]){
        DeviceContext context = new DeviceContext();
        context.currentState();
        System.out.println("Changing device...");
        context.setDevice(new GPU());
        context.currentState();
    }
}
