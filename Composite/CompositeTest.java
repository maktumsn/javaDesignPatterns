public class CompositeTest {
    public static void main(String[] args) {

        Component hd =new Leaf(2000,"HDD");
        Component mouse =new Leaf(300,"Mouse");
        Component monitor =new Leaf(6000,"Monitor");
        Component ram =new Leaf(4000,"RAM");
        Component cpu =new Leaf(9000,"CPU");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponents(cpu);
        mb.addComponents(ram);

        ph.addComponents(mouse);
        ph.addComponents(monitor);

        cabinet.addComponents(hd);
        cabinet.addComponents(mb);

        computer.addComponents(ph);
        computer.addComponents(cabinet);

        computer.showPrice();
        System.out.println("**************************************************");
        ram.showPrice();//just leaf price
        System.out.println("**************************************************");
        cabinet.showPrice();






    }
}
