#include <stdio.h>
#include <math.h>
int main()
{
  
    int number, temp, rem, result = 0, n = 0 ;
    scanf("%d", &number);
    temp = number;
    while (temp != 0)
    {
        temp /= 10; ++n;
    }
    temp = number;
    while (temp != 0)
    {
        rem = temp%10;
        result += pow(rem, n);
      temp/=10;
    }
    if(result == number)
        printf("Armstrong number", number);
    else
        printf("Not an Armstrong number", number);	
  
}
