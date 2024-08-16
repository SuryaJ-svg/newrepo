public class sensor {

    private double thresholdValue;
    private double currentValue;

    public void setValue (double newThresholdValue, double newCurrentValue){
        this.thresholdValue =  newThresholdValue;
        this.currentValue =  newCurrentValue;
    }

    public double getValue (){
        return currentValue;
    }

    public boolean check () {
    if (currentValue > thresholdValue) {
        return true;
    } 
    else  {
    return false;
    }
    
}

    
    //public static void main (String args[]) {
        
        //sensor obj = new sensor();
        //obj.setValue(48);
        //System.out.println(obj.getValue());
        // System.out.println(obj.threshold(50));
        // System.out.println(obj.current(51));
        // System.out.println(obj.check(50, 49));


   //}
}
