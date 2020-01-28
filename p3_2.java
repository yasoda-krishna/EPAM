class p3_2{
  public static void main(String[] args) {
    int k=args.length;

    if(k!=4)
    {
      System.out.println("Please enter 4 integer numbers");
    }
    else
    {     int[][] n=new int[2][2];
int a=0;
      for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
        {n[i][j]=Integer.parseInt(args[a]);
          System.out.print(n[i][j]+" ");
          a++;
        }
        System.out.println();

    }
      System.out.println();
      System.out.println("The reverse array is");
      for(int i=1;i>=0;i--)
      {
        for(int j=1;j>=0;j--)
        {
          System.out.print(n[i][j]+" ");
        }
        System.out.println();
      }

      //System.out.println("The biggest number in the given array is "+max);
      }


  }
}
