class p2_6{
  public static void main(String[] args) {
    int k=args.length;

    long factorial=1;
    if(k==0)
    {
      System.out.println("Enter the number");
    }
    else
    {     int n=Integer.parseInt(args[0]);
      if(n==1)
      {
        factorial=1;
      }
      else
      {
        do{
          factorial=factorial*n;
          n--;
        }while(n!=0);
      }
      }
    System.out.println(factorial);
  }
}
