#include<stdio.h>
#include<stdlib.h>          //malloc
#include<unistd.h>          //
#include<fcntl.h>           //open,close,read,write this function

int main()
{
    char Name[30];
    int fd = 0;
    printf("Enter name of file that you want to create : \n");
    scanf("%s",Name);

    fd = creat(Name,0777);              //0 menas octal, fd means file descripter
    if(fd == -1)                        //0,1,2,... file create else -1 unable to create
    {
        printf("Unable to craete file\n");
    }
    else
    {
        printf("file gets created with FD %d\n",fd);
    }

    return 0;
}