#include<stdio.h>
#include<stdlib.h>          //malloc
#include<unistd.h>          //
#include<fcntl.h>           //open,close,read,write this function

int main()
{
    char Name[30];
   
    printf("Enter name of file that you want to delete : \n");
    scanf("%s",Name);

    unlink(Name);    

    return 0;
}