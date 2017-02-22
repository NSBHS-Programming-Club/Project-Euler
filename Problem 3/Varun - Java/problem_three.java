 //This is the slowest solution you will find also very inneficatn but it works
 //Total execution time 2min
 //I am aware i could have drawn a factor tree
 import java.math.*;
public class problem_three{
    public static void main(String args[]){
      long numToCalc = 600851475143L;
      System.out.println(getHighestPrimeFactor(numToCalc));  
    }
    public static boolean isPrime(long number){
        for(long i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static long getHighestPrimeFactor(long num){
        //calculate lowest val
        double sqrt = (double) num;
        Long divisor = Math.sqrt(sqrt);
        for(long i = divisor; i > 0; i--){
            System.out.println(i);        
            if(num % i == 0 && isPrime(i) == true){
                return i;
            }
            if(isPrime(i)){
                i--;
            }
        }
        return 0;
    }
}