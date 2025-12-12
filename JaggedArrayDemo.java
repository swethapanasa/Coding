import java.util.Scanner;
class jaggedArrayDemo
{
    public static void main(String args[])
    {
        int[][] jaggedArray;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of row for jaggedArray");
        int numRows=sc.nextInt();
        jaggedArray=new int[numRows][];
        for(int i=0;i<numRows;i++)
        {
            System.out.println("Enter the no.of column for rows"+i+":" );
            int numcol=sc.nextInt();
            jaggedArray[i]=new int[numcol];
        }
        for(int i=0;i<jaggedArray.length;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.println("Enter the elements at ["+i+"]["+j+"]:");
                jaggedArray[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nJagged Array Contents:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
