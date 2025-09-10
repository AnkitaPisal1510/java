class Main {
    public static void main(String[] args) {
    int  [][]m1={{2,3,7},{8,9,2},{5,7,8}};
    int  [][]m2={{1,7,9},{3,4,11},{12,13,88}};
    int sum=0;
    int avg=0;
    int [][] c=new int [3][3];
    for (int i= 0;i<3 ; i++){
        for (int j=0;j<3;j++){
            sum+=m1[i][j]+m2[i][j];
            c[i][j]=m1[i][j]+m2[i][j];
            System.out.print(c[i][j]+" ");
        }
        avg=sum/9;
    }
System.out.println("\nit is the sum of matrix "+sum);

System.out.println("\nit is the average of matrix "+avg);

    }
}