#include<stdio.h>
#include<stdlib.h>          //malloc
#include<unistd.h>          //
#include<fcntl.h>           //open,close,read,write this function

//o_RDONLY   read mode
//O_WRONLY   write mode
//O_RDWR     read + write mode

int main()
{
    char Name[30];
    int fd = 0;
    printf("Enter name of file that you want to open : \n");
    scanf("%s",Name);

    fd = open(Name,O_RDWR);              //0 menas octal, fd means file descripter
    if(fd == -1)                        //0,1,2,... file create else -1 unable to create
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("file gets opened with FD %d\n",fd);
    }

    close(fd);

    return 0;
}