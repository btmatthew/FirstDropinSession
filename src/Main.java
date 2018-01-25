public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus",3.21,2,false);
        Laptop laptop2 = new Laptop();
        laptop2.setMaker("HP");
        laptop2.setCpuSpeed(3.32);
        laptop2.setVersion(4);
        laptop2.setUsed(true);
        Laptop laptop3 = new Laptop("MAC",3.45,6,true);

        System.out.println(laptop1.getMaker());
        System.out.println(laptop1.getCpuSpeed());
        System.out.println(laptop1.getVersion());
        System.out.println(laptop1.isUsed());
        System.out.println();
        System.out.println(laptop2.getMaker());
        System.out.println(laptop2.getCpuSpeed());
        System.out.println(laptop2.getVersion());
        System.out.println(laptop2.isUsed());
        System.out.println();
        System.out.println(laptop3.getMaker());
        System.out.println(laptop3.getCpuSpeed());
        System.out.println(laptop3.getVersion());
        System.out.println(laptop3.isUsed());


    }
}
