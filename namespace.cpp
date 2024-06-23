#include<iostream>
//using namespace std;        //Inbuilt namespace           way1

namespace Marvellous
{
    class Demo
    {
        //Logic
    };
}

namespace PPA
{
    class Hello
    {
        //Logic
    };
}

using namespace Marvellous;
int main()
{
    std::cout<<"Inside main\n";             //way2
    Demo dobj;
    PPA::Hello hobj;

    return 0;
}