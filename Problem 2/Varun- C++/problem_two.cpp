#include <iostream>

int fibGetSum(unsigned long maxNum) {
    unsigned long previousNumber = 1;
    unsigned long prevPrevNumber = 0;
    unsigned long fib = 0;
    unsigned long answer = 0;

    while(fib <= maxNum){
        fib = previousNumber+prevPrevNumber;
        prevPrevNumber = previousNumber;
        previousNumber = fib;
        std::cout << fib << ":" << answer <<std::endl;
        if(!(fib%2)){
            answer += fib;
        }
        if(fib >= maxNum){
            if(!(fib%2)){
                return answer-fib;
            }else{
                return answer;
            }
        }
    }
}

int main(void)
{
    std::cout << fibGetSum(4000000) << std::endl;
    int i;
    std::cin >> i;
    return 0;
}



