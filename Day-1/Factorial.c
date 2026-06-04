// Factorial by recursion function

#include <stdio.h>

int factorial(int x);

int main()
{
    int num, fact;

    printf("Enter number: ");
    scanf("%d", &num);

    fact = factorial(num);

    printf("Factorial of %d is %d", num, fact);

    return 0;
}

int factorial(int x)
{
    if (x == 0 || x == 1)
    {
        return 1;
    }

    return x * factorial(x - 1);
}