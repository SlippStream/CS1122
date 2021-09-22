public class Test {
    public static void main(String[] args) {
        GarbageFire gf = new GarbageFire();
        gf.GarbonzoBeans();
    }
    protected void greg() {
        System.out.println("hi");
    }
}

class GarbageFire extends Test{
    public GarbageFire() {
        greg();
    }

    public void GarbonzoBeans() {
        System.out.println("beans");
    }
}