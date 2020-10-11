 #include<bits/stdc++.h>
using namespace std;
void isPalindrome(string str) 
{ 
    // Start from leftmost and rightmost corners of str 
    int l = 0; 
    int h = str.length()- 1; 
    while (h > l) 
    { 
        if (str[l++] != str[h--]) 
        { 
            cout<<"0"; 
            return; 
        } 
    } 
cout<<"1";  
} 
int main() 
{ 

   string str;
   cin>>str;
    isPalindrome(str); 

    return 0; 
}