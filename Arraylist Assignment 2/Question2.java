import java.util.ArrayList;
public class Question2
{
    public static void goldbach (int n){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int sum = 0;
        
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }
        
        
        for (int i = 0; i < primes.size(); i++) {
            int p = primes.get(i);
            for (int j = i+1; j < primes.size(); j++ ) {
                if (primes.get(j) % p == 0) {
                    primes.remove(j);
                    j--;
                }
            }
        }
        int x = 0;
        int y = primes.size()-1;
        while(sum!=n){
            sum = primes.get(x) + primes.get(y);
            if(sum > n){
                y--;
            }
            else if(sum<n){
                x++;
            }
        }
        
        System.out.println(primes.get(x) + "+" + primes.get(y));
    }
    
}
