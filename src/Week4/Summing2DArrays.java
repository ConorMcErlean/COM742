package Week4;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 14/02/2020
*/
public class Summing2DArrays {
    public static int rowSum(int[][] a, int x)  {
        int sum = 0;
        for (int col = 0; col < a[x].length; col++){
            sum += a[x][col];
        }// for
        return sum;
    }
    public static int colSum(int[][] a, int x)  {
        int sum = 0;
        for (int col = 0; col < a.length; col++){
            sum += a[col][x];
        }// for
        return sum;
    }
    public static int[] allRowSums(int[][] a){
        int[] rowSums = new int[a.length];
        for (int index = 0; index < rowSums.length; index++){
            rowSums[index] = rowSum(a, index);
        }
        return rowSums;
    }
    public static int[] allColSums(int[][] a){
        int[] colSum = new int[a[0].length];
        for (int index = 0; index < colSum.length; index++){
            colSum[index] = colSum(a, index);
        }
        return colSum;
    }
    public static boolean isRowMagic(int[][] a){
        boolean magic = false;
        int [] magictest = allRowSums(a);
        int last = magictest[0];
        for (int index = 1; index<magictest.length; index++){
            // Check
            if (magictest[index] == last){
                magic = true;
            }
            else{
                magic = false;
            }
        }// for
        return magic;
    }
    public static boolean isColMagic(int[][] a){
        boolean magic = false;
        int [] magictest = allColSums(a);
        int last = magictest[0];
        for (int index = 1; index<magictest.length; index++){
            // Check
            if (magictest[index] == last){
                magic = true;
            }
            else{
                magic = false;
            }
        }// for
        return magic;
    }


    public static void main(String[] arg) {
        int [][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
        int [][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
        int [] rowsum = allRowSums(rowmagic);
        int [] colsum = allColSums(rowmagic);

        for(int i = 0; i < rowsum.length; i++)
            System.out.println("All rows sums = " + rowsum[i]);

        for(int i = 0; i < colsum.length; i++)
            System.out.println("All cols sums = " + colsum[i]);

        System.out.println("Is row magic = " + isRowMagic(rowmagic));
        System.out.println("Is row magic = " + isRowMagic(colmagic));
        System.out.println("Is col magic = " + isColMagic(rowmagic));
        System.out.println("Is col magic = " + isColMagic(colmagic));

    }// main
}// class
