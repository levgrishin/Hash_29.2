public class Main {
    public static void main(String[] args) {
        String s = "sfalgo";
        int p = 2;
        long mod = 1000000000L;
        long hs = 0;
        int sl = s.length();
        for (int j = 0; j < s.length(); j++) {
            hs += Math.pow(p,j)*signNumber(s,j);
            }
        hs = hs % mod;
        System.out.println(hs);
    }

    public static int signNumber(String s, int i){
        int n = -1;
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                "o","p","q","r","s","t","u","v","w","x","y","z"," "};
        String arrSign;
        s = s.substring(i,i+1);
        for (int j = 0; j < abc.length; j++) {
            arrSign = abc[j];
            if (s.equals(arrSign)) {
                n = j;
                break;
            }
        }
        return n;
    }

}
