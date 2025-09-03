class matrix{
public static void main (String args []){

	int a[3][3]={{2,3,4},{1,1,1},{2,2,2}};
	int b[3][3]={{2,1,9},{4,3,2},{1,7,9}};
	int k[3][3];
	for (int i; i<3 ;i++){
		for (int j=0;i<3;j++){
		   for (int k; k<3;k++){
		k[i][j]+=a[i][j]*b[i][j];
	
  }

}
  }
System.out.println(k[i][j]);
}
}