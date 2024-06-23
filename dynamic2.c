#include<stdio.h>
#include<stdlib.h>     //for malloc,calloc,realloc & free

int main()
{
    int Arr[5];        //static memory allocation
    int size = 0;
    int *ptr = NULL;

   
    printf("Enter number of element : \n");
    scanf("%d",&size);

    ptr = (int*)calloc(size , sizeof(int));
    // ptr = (int *)calloc(12 , 500ml);
    // ptr = (int *)malloc(6000ml);
    
    //Use the memory

    free(ptr);

    return 0;
}