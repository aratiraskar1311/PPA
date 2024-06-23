#include<iostream>
using namespace std;

int main()
{
   int *ptr = NULL;
   int size = 0;
 
   cout<<"Enter the size of array :\n";
   cin>>size;

   ptr = new int(size);

   //use the memory

   delete []ptr;


    return 0;
}