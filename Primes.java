public class Primes {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        boolean [] p = new boolean[n];
        int i = 2;
        int i1 = 2;
        p[0]=false;
        p[1]=false;
        int primes = 0;
        for(i=2;i<n;i++){
            p[i]=true;
        }
        i=2;
        while(i<n){
            if(p[i]==true){
                i1=i+1;
                while(i1<n){
                    if(i1%i==0){
                        p[i1]=false;
                    }
                    i1++;
                }
            }
            i++;
        }
        for(i=0;i<n;i++){
            if(p[i]==true){
                System.out.println(i);
                primes++;
            }
        }
        int precent = (100*primes)/n;
        System.out.println("There are " +primes+" primes between 2 and "+n+" ("+precent+"% are primes)");
        }
}