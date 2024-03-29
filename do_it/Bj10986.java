package do_it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sum = new long[N];
        long[] res = new long[M];
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());
        for(int i = 1 ; i < N ;i++)
        {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N ; i++)
        {
            int remain = (int)(sum[i]%M);
            res[remain]++;
            if(remain == 0)
                ans++;
        }


        for(long num : res)
        {
            if(num > 1)
                ans += num*(num-1)/2;
        }

        System.out.println(ans);

    }

}
