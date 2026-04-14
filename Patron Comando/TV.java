public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
        System.out.println(location + " TV channel is set for DVD");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }
}