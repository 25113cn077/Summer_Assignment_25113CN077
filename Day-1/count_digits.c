// count of digit

#include<stdio.h>

int main(){
    int num, count=0, Og_num;

    printf("Enter number:");
    scanf("%d",&num);

    Og_num = num ;

    while(num>0){
        count = count + 1;
        num = num/10;
    }

    printf("Number in %d id %d",Og_num,count);
    return 0;
    
}