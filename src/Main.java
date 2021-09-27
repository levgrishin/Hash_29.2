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

        //hash 2 array
        int[][] matrArray = {
                { 6, 8, 5, 4 },
                { 7, 12, 5, 7 },
                { 12, 8, 9, 1 } };

        int p0 = 6;
        int q0 = 7;
        int mod0 = 1000;

        System.out.println("Результат: " + matrHashCalc(matrArray,p0,q0,mod0));


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

    public static int matrHashCalc(int[][] matr, int p, int q ,int mod) {
        int hashResult = 0;
            for (int i = 0;i < matr.length;i++){
                for (int j = 0;j < matr[i].length;j++){
                    hashResult += Math.pow(p,i) * Math.pow(q,j) * matr[i][j];
                }
            }
            hashResult = hashResult % mod;
        return hashResult;
    }


}
