
#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[] = "Hello";                   
    char Brr[] = {'H','E','L','L','O','\0'};

    printf("%s\n",Arr);
    printf("%s\n",Brr);

    printf("%d\n",strlen(Arr));         //strlen no of elements
    printf("%d\n",strlen(Brr));

    printf("%d\n",sizeof(Arr));
    printf("%d\n",sizeof(Brr));

    return 0;

}
