#include<stdio.h>

int main()
{  
    int number=60, i;
    for(i=1; i <= 60; i++)
    {
        if (number%i == 0)
        {
            printf("%d ",i);
        }
    } 
    return 0;
}


