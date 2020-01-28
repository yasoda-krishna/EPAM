class p3_1{
  public static void main(String[] args) {
    int k=args.length;

    if(k!=9)
    {
      System.out.println("Please enter 9 integer numbers");
    }
    else
    {     int[][] n=new int[3][3];
      int a=0;
      int max=0;
      int z=0;
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {n[i][j]=Integer.parseInt(args[a]);
          System.out.print(n[i][j]+" ");
          if(max<n[i][j])
          {max=n[i][j];}
          a++;
        }
        System.out.println();
      }
      System.out.println("The biggest number in the given array is "+max);
      }

  }
}
