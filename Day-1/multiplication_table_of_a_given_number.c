
#include<stdio.h>

int main()
{
    int n,mp=1;
    printf("Enter number: ");
    scanf("%d",&n);

    for(int i=1; i<11; i++){
        mp = n * i;
        printf("%d\n",mp);
    }
    
    return 0;
}