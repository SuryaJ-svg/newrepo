public class lasagna {

    int ExpectedCookingTime = 50;
    
    public int preparationTime(int layers){
        return layers * 2;
    }
    public int expectedMinutesInOven(int minutesInOven){
        return ExpectedCookingTime - minutesInOven;
    }
    public int totalTimeSpent (int minutesInOven, int preparationTime) {
        return minutesInOven + preparationTime(5);
        //call a method within a mehtod under the same scope wihtout creating a new object
    }

    public static void main (String args[]) {

    lasagna obj = new lasagna();

    System.out.println(obj.preparationTime(5));
    System.out.println(obj.expectedMinutesInOven(20));
    System.out.println(obj.totalTimeSpent(20,5));
}
}