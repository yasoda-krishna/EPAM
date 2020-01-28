class p2_2{
  public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    if(n==0||n==1)
    {
      System.out.println(n+" is neither prime nor composite");
    }
    else if(n==2||n==3)
    {
      System.out.println(n+" is a prime number");
    }
    else
    { int flag=0;
      for(int i=2;i<(n/2)+1;i++)
      {
        if(n%i==0)
        {flag=1;
          break;
        }
      }
      if(flag==1)
      {
        System.out.println(n+" is not a prime number");
      }
      else
      {
        System.out.println(n+" is a prime number");
      }
    }
  }
}
