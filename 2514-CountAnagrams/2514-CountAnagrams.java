// Last updated: 09/07/2026, 17:53:49
1import java.math.BigInteger;
2class Solution {
3    long mod = (long) (1e9 + 7);
4    long[] fac;
5    public int countAnagrams(String s) {
6
7        fac = new long[s.length() + 1];
8        fac[1] = 1;
9      for (int i = 2; i <= s.length(); i++) {
10            fac[i] = (fac[i - 1] * i) % mod;
11        }
12        String[] ws = s.split(" ");
13        long ans = 1;
14        for (String w : ws) {
15            ans = (ans * calc(w)) % mod;
16        }
17        return (int)ans;
18    }
19    private long calc(String w) {
20        Map<Character, Integer> m = new HashMap<>();
21        for (char ch : w.toCharArray()) {
22            m.put(ch, m.getOrDefault(ch, 0) + 1);
23        }
24        long all = fac[w.length()];
25        for (int v : m.values()) {
26            long inv = BigInteger.valueOf(fac[v]).modInverse(BigInteger.valueOf(mod)).longValue();
27            all = all * inv % mod;
28        }
29        return all;
30    }
31}