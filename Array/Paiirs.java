public class Paiirs {
   public static void printPairs(int numbers[]){
     for(int i = 0 ; i<numbers.length; i++)
     {
        int current = numbers[i]; // 2,4,6,8
        for(int j = i+1; j<numbers.length; j++)
        {
           System.out.print("("  + current + "," + numbers[j] + ") ");
        }
        System.out.println();
     }

   }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
   }

}
