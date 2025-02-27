public class question9 {
    public static void main(String[] args){
        //1
        //1 1
        //1 2 1
        //1 3 3 1
        //1 4 6 4 1
        int rows=5;
        int[][] arr=new int[rows][rows];

        arr[0][0]=1;

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){

                 if(j==0||i==j){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for(int i=0;i<rows;i++){
 for(int j=0;j<rows-i-1;j++){
     System.out.print(' ');
 }
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
