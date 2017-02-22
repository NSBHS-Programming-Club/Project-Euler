#include <iostream>

/** 1^2 + 2^2 + ... + 10^2 = 385 **/
int sumSqare(int maxNum){
    int sum = 0;
    for(int i = 0; i < maxNum+1; i++){
        sum += i*i;
    }
    return sum;
}

/** (1 + 2 + ... + 10)^2 */
int sqareSum(int maxNum){
    int sum = 0;
    for(int i = 0; i < maxNum+1; i++){
        sum += i;
    }
    return sum*sum;
}

int main(void){
    std::cout << sqareSum(100)-sumSqare(100);
}
