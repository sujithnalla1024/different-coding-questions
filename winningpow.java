import java.util.*;
public class winningpow
{
public static void main(String args[])
  {
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=power(n);
System.out.print(c);


  }
static int power(int n){
	
		return n-(int)Math.pow(2,(int)((Math.log(n))/(Math.log(2))));


}
}