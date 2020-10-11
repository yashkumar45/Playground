#include<stdio.h>
int dec_to_oct(int n)
{
    int octal=0,i=1;
    while(n!=0)
    {
      octal+=(n%8)*i;
      n/=8;
      i*=10;
    }
  return octal;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
