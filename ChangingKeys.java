public class ChangingKeys {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int out = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                out++;
            }
        }
        return out;
    }
}
