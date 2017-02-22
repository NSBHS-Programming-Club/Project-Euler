public class prob_six{

    public static void main(String args[]){
        System.out.println(smallestDivNum());
    }

    public static int smallestDivNum(){
        for(int x = 1; x < Double.POSITIVE_INFINITY; x++){
            if(checkDivisible(x) == true){
                return x;
            }else{
                continue;
            }
        }
        return 0;
    }

    public static boolean checkDivisible(int num) {
        for(int j = 1; j < 20; j++){
            if(!(num % j == 0)){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }
}