class p2_7{
  public static void main(String[] args) {
    int k=args.length;

    if(k==0)
    {
      System.out.println("Enter the integer number");
    }
    else
    {     int n=Integer.parseInt(args[0]);
      for(int i=0;i<n;i++)
      { int z=0;
        while(z<i+1)
        {
          System.out.print("* ");
          z++;
        }
        System.out.println();
      }
      }

  }
}
