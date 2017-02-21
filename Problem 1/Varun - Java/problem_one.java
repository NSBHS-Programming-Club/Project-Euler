public class problem_one {
    public static void main(String args[]){
        System.out.println(naturalNumber(10000));
    }

    public static int naturalNumber(int max){
        int sum = 0;        
        for(int i = 0; i < max; i++){
            if((i%3 == 0) || (i%5 == 0)){
                System.out.println(sum);
                sum += i;
            }else{
                continue;
            }
        }
        return sum;
    }
}
