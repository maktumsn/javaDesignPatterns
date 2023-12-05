public class OSFactory {
    public  OS getInstance(String s) {
        if(s=="open source")
            return new Android();
        else if (s=="closed")
            return new IOS();
        else return new Windows();

    }
}
