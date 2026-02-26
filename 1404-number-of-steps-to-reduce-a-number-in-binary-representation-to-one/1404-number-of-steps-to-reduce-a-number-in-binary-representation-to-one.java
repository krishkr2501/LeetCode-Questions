import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger val = BigInteger.ZERO;
        for(int i=0,j=s.length()-1;i<s.length() && j>=0;i++,j--){
            if(s.charAt(i) == '1'){
                val = val.add(BigInteger.TWO.pow(j));
            }
        }
        int steps = 0;
        while(val.compareTo(BigInteger.ONE)>0){
            if(val.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                val = val.divide(BigInteger.TWO);
            }
            else{
                val = val.add(BigInteger.ONE);
            }
            steps++;
            if(val.equals(BigInteger.ONE)){
                break;
            }
        }
        return steps;
    }
}