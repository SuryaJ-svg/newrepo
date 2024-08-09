public class lasagna {
    public static void main (String args[]) {
        int cookingTime = 40;

    }
    public int expectedMinutesInOven(){
        return cookingTime;
    }

    public int remainingMinutesInOven(int minPassed){
        return cookingTime - minPassed;
    }

    public int preparationTime(int layers){
        return layers * 2;
    }

}
