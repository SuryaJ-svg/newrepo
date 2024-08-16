public class robot {
    public static void main(String[] args) {
    
        sensoraction obj = new sensoraction();
        sensor obj2 = new sensor();

        obj2.setValue(50, 51);
        
        if (obj2.check() == true) {
            System.out.println(obj.action());
        }
    }

}
