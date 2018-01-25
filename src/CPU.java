public class CPU {

    private double mhz=0.0;
    private String cpuMaker="";


    public CPU(double mhz, String cpuMaker) {
        this.mhz = mhz;
        this.cpuMaker = cpuMaker;
    }

    public double getMhz() {
        return mhz;
    }

    public void setMhz(double mhz) {
        this.mhz = mhz;
    }

    public String getCpuMaker() {
        return cpuMaker;
    }

    public void setCpuMaker(String cpuMaker) {
        this.cpuMaker = cpuMaker;
    }
}
