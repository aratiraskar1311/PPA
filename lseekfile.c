#include<stdio.h>
#include<stdlib.h>          //malloc
#include<unistd.h>          //
#include<fcntl.h>           //open,close,read,write this function

//o_RDONLY   read mode
//O_WRONLY   write mode
//O_RDWR     read + write mode

//SEEK_SET     Beginning of file
//SEEK-CUR     Current position
//SEEK_END     End of file

int main()
{
    char Name[30];
    int fd = 0;
    int iRet = 0;
    char Data[30] = {'\0'};           //empty array

    printf("Enter name of file that you want to open : \n");
    scanf("%s",Name);

    fd = open(Name,O_RDWR);              //0 menas octal, fd means file descripter
   
   lseek(fd,10,SEEK_SET);

   iRet = read(fd,Data,10);

   printf("%d bytes gets successfully read from the file\n",iRet);

    printf("%s\n",Data);
    
    close(fd);

    return 0;
}