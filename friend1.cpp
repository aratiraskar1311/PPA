#include<iostream>
using namespace std;

class Demo
{
   public:
      int i;
   private:
       int j;
   protected:
       int k;

    public:
       Demo()
       {
          i = 10;
          j = 20;
          k = 30;
       }  
       friend void Fun();              //function declairation
};

void Fun()       //friend function-----function defination
{
   Demo obj;        //function mdhun access kraycha aahe mhanun object create ya function mdhe
   cout<<obj.i<<"\n";
   cout<<obj.j<<"\n";
   cout<<obj.k<<"\n";
}
int main()
{
    Fun();         

    return 0;
}