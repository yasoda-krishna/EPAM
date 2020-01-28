class p2_3
{
  public static void main(String[] args) {
    String s=args[0];
    int n=s.length();
    int flag=1;
    for(int i=0;i<n/2;i++)
    {
      if(s.charAt(i)!=s.charAt(n-i-1))
    {
    flag=0;
    break;
    }    }
    if(flag==0)
    {
      System.out.println(s+" is not a palindrome");
    }
    else
    {
      System.out.println(s+" is a palindrome");
    }

  }
}
