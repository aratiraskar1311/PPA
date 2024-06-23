#include<stdio.h>

void Display(int No)            //callee
{
    static int iCnt = 0;

    if(iCnt < No)
    {
        printf("Jay Ganesh...\n");
        iCnt++;
        Display(No);                    //  Recursive call

    }
}
int main()          //caller
{
    Display(3);     

    return 0;
}