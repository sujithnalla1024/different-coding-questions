import java.util.*;
public class deque{
    public static void main(String args[])
    {
        /*Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int count=0;
        int mod=1000000007;int j=0;
        for(int i=n;i>=1;i--)
        {
          int l=(((n)*(n+1)/2)%mod);
          count+=((l%mod)*(a[j]))%mod;
          j++;
        }*/
		List<Integer> a=new ArrayList<>();
		a.add(9);
		a.add(5);
		a.add(8);int sum=0;int mod=1000000007;
		for(int i=1;i<=a.size();i++)
    {
        List<Integer> b=new ArrayList<>();
        for(int j=0;j<i;j++)
        {
            b.add(a.get(j));
        }
        Collections.sort(b);
		System.out.println(b);
        for(int j=1;j<=b.size();j++)
        {
            sum+=((((b.get(j-1))%mod)*j)%mod);
			System.out.println(sum);
        }
    }
        System.out.print(sum);

    }
}