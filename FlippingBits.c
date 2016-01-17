#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    scanf("%d",&t);
    while(t-- >0){
        unsigned int n;
        scanf("%ud",&n);
        unsigned int sent;
        sent=4294967295;
        n=n^4294967295;
        printf("%u\n",n);
    }
    return 0;
}
