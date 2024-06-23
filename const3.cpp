#include<iostream>
using namespace std;



class Demo
{
    public:
       int X,Y;
    Demo()
       {
        X = 10;
        Y = 20
       }
       void Fun()                        //normal function
       {
           cout <<"Inside Fun\n";
           X++;
           Y++;
       }
       void Gun()const               //constant function
       {
            cout<<"Inside Gun\n";
            //X++;
            //Y++;
       }
       
};
int main()
{
    
    Demo obj1;
    const Demo obj2;

    obj1.Fun();     //normal object normal function
    obj1.Gun();      //normal object constant function

    obj2.Fun();       //constant object normal function     Not allowed
    obj2.Gun();        //constant object constant function

    return 0;
}