#include <iostream>
using namespace std;
#include<bits/stdc++.h>
int main() 
{
   int n,k,sum=0;
  cin>>n;
  cin>>k;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  sort(arr,arr+n,greater<int>());
  for(int i=0;i<k;i++)
    sum =sum+arr[i];
  cout<<sum;
  return 0;
}