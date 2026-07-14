// Last updated: 7/14/2026, 11:35:56 AM
1class Solution {
2    public int fib(int n) {
3        if(n==0)
4        return 0;
5        if(n==1)
6        return 1;
7        int a=0;
8        int b=1;
9        int c=0;
10        for(int i=2;i<=n;i++){
11             c=a+b;
12            a=b;
13            b=c;
14            
15        }
16        return c;
17    }
18}