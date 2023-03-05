package cz.fel.cvut.ts1;

public class Proj1 {
    public long factorial (int n){
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }

        return result;
    }

}
