public class Laptop extends CPU{

    private String maker;
    private int version;
    private boolean used;

    public Laptop(double mhz, String cpuMaker,String maker,int version,boolean used) {
        super(mhz, cpuMaker);
        this.maker=maker;
        this.version=version;
        this.used=used;
    }

    public String getCpuMaker() {
        return maker;
    }

    public void setCpuMaker(String cpuMaker) {
        this.maker = cpuMaker;
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
