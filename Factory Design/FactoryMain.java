public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf=new OSFactory();
        OS obj =osf.getInstance("open source"); //hiding the implementation from the client
         obj.spec();
    }
}
