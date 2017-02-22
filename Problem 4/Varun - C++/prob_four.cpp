#include <iostream>
#include <string>
#include <algorithm>

bool isPallindrome(int num) {
    int dig;
    int n = num;
    int rev = 0;
    while(num > 0){
        dig = num % 10;
        rev = rev * 10 + dig;
        num = num / 10;
    }
    if(n == rev){
        return true;
    }  else{
        return false;
    } 
}

int calcMax(){
    int max = 0;
    for(int i = 999; i > 0; i--){
        for(int x = 999; x > 0; x--){
            if(isPallindrome(i * x) && ((i * x) > max)){
                max = i*x;
                std::cout << i << std::endl << x << std::endl << i*x << std::endl << std::endl;
            }else{
                continue;
            }
        }
    }
    return max;
}

int main(void) {
    std::cout << calcMax();
    return 0;
}