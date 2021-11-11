import java.util.Scanner;
class MaxPathSum
{ 
      
    // Function to calculate max path in matrix 
    static int[] MaximumTotal(int mtrix[][],int len) 
    { 
        //Finding maximum value in first row 
        int maxim = -1; int a[]=new int[len+1];int c=1;
        for (int i = 0; i < len; i++) 
            a[0] = Math.max(a[0], mtrix[0][i]); 
            int counter=a[0];
  
        for (int i = 1; i < len; i++)  
        { 
            maxim = -1; 
            for (int j = 0; j < len; j++)  
            { 
                // Comparing diagonally left and diagonally right paths.
                if (j > 0 && j < len - 1) 
                mtrix[i][j] += Math.max(mtrix[i - 1][j],Math.max(mtrix[i - 1][j - 1],mtrix[i - 1][j + 1])); 
  
  
               // When diagonally left path is not possible 
                else if (j < len - 1) 
                mtrix[i][j] += Math.max(mtrix[i - 1][j],mtrix[i - 1][j + 1]); 
  
                // Stores the maximum path sum 
                maxim = Math.max(mtrix[i][j], maxim); 
            } 
            
            a[c++]=maxim-counter;
            counter=maxim;
            
        } 
        
        a[len]=maxim;
        return a;
    } 

// driver program 
    public static void main (String[] args)  
    { 
    Scanner st = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter the dimension of the Triangle");
    int n=st.nextInt();
    if(n>5)
    {
        System.out.println("Enter the dimension between the range 1 to 5");
        return;
    }
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            count++;
        }
    }
    System.out.println("Enter "+ count+ " Elements");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            arr[i][j]=st.nextInt();
            if(arr[i][j]>9 || arr[i][j]<0)
            {
              System.out.println("Enter the numbers between the range 0 to 9");
              return;
            }
 
            }
    }
        int[] b=MaximumTotal(arr,n); // obtain the path array
        System.out.print("The maximum path sum of the triangle is: ");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" "); 
        }
    } 
} 
