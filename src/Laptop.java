public class Laptop{

    private String maker;
    private double cpuSpeed;
    private int version;
    private boolean used;

    public Laptop(String maker, double cpuSpeed, int version, boolean used) {
        this.maker = maker;
        this.cpuSpeed = cpuSpeed;
        this.version = version;
        this.used = used;
    }

    public Laptop() {
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
