#include<stdio.h>
#include<string.h>

int Equal(int a, int b, int c) 
{     
if (a==b && b==c &&c==a)
 {       
 	return 1; 
 }   
 else if( a==b&&a!=c&&b!=c)
 {        
 	return 2;
 }  
 else if(a!=b&&b!=c&&c!=a) 
 {   
      return 3; 
 }
 else 
 {   
    return 0; 
 }

}


int main() 
{ 
  int a,b,c;   
  scanf("%d%d%d",&a,&b,&c);       
  if (Equal(a, b, c)==1) 
  {    
 	printf("Equilateral Triangle");  
  }   
  else if(Equal(a,b,c)==2) 
  {  
  	printf("Isosceles Triangle"); 
  }   
  else if(Equal(a,b,c)==3) 
  {     
	printf("Right angle triangle/Scalene triangle");
  }
  else 
  {   
      printf("Not Triangle"); 
  }   
}
