/* part 2
public class lasagna {
    int cookingTime = 40;

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
*/
//part 3
class totalTimeInMinutes(){
    public int totalTime (int cookingTime, int layers) {
        return cookingTime+layers;
    }
}

public static void main (String args[]) {
    int cookingTime = 40;
    int layers = 5;
    
   totalTimeInMinutes obj = new totalTimeInMinutes();
   System.out.println(obj.totalTimeInMinutes(cookingTime, layers));

}
