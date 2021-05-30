package logic1;

public class maxMod5 {
    public int maxMod5(int a, int b) {
        int ans = 0;
        if( a == b ){
            ans = 0;
        }
        else if (a% 5 == b% 5){
            if ( a < b) {
                ans = a;
            }
            else ans = b;
        }
        else {
            if (a < b){
                ans = b;
            }
            else ans = a;
        }
        return ans;
    }


}
