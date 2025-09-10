#include <stdio.h>

int main() {
    int m1 [3][3]={{2,3,7},{8,9,2},{5,7,8}};
    int m2 [3][3]={{1,7,9},{3,4,11},{12,13,88}};
    int sum=0;
    int avg=0;
    for (int i= 0;i<3 ; i++){
        for (int j=0;j<3;j++){
            sum+=m1[i][j]+m2[i][j];
        }
        avg=sum/9;
    }
    printf("it is the sum of matrix %d\n",sum);
    printf("it is the average of matrix %d",avg);
    return 0;
}