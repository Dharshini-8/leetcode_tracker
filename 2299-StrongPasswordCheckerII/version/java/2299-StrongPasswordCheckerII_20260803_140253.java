// Last updated: 8/3/2026, 2:02:53 PM
1class Solution {
2    public boolean strongPasswordCheckerII(String password) {
3
4        if (password.length() < 8)
5            return false;
6
7        boolean lower = false;
8        boolean upper = false;
9        boolean digit = false;
10        boolean special = false;
11
12        String sp = "!@#$%^&*()-+";
13
14        for (int i = 0; i < password.length(); i++) {
15
16            char ch = password.charAt(i);
17
18            if (i > 0 && ch == password.charAt(i - 1))
19                return false;
20
21            if (Character.isLowerCase(ch))
22                lower = true;
23            else if (Character.isUpperCase(ch))
24                upper = true;
25            else if (Character.isDigit(ch))
26                digit = true;
27            else if (sp.indexOf(ch) != -1)
28                special = true;
29        }
30
31        return lower && upper && digit && special;
32    }
33}