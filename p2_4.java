class p2_4
{
  public static void main(String[] args) {
    String s=args[0];
    int n=s.length();
    int sum=0;
    String z="";
    for(int i=0;i<n;i++)
    {z=""+s.charAt(i);
      sum=sum+Integer.parseInt(z);
    }
    System.out.println("The sum of the digits of "+s+" is "+sum);

  }
}
