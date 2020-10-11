#include<stdio.h>
int bin_to_dec(int n)
{
     int dec=0,i=0,rem;
  while(n!=0)
  {
    rem=n%10;
    n/=10;
    dec+=rem*pow(2,i);
    ++i;
}
  return dec;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}