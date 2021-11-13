package com.codilty;

public class Main {

    public static void main(String[] args) {
        int[] arrays = new int[] {1,3,1,4,2,3,5,4} ;

        int k  = frogRiver(5,arrays);
        System.out.println(k);
        //System.out.println((equilibrium(arrays)));
       ///int[] arrs = rotationCiycle(arrays,2);
        /*for (int k:arrs)
            System.out.println(k);
      */

    }
    public  static int  equilibrium(int[] arrs) {
        int leftSum = arrs[0];
        int rightSum = 0;
        int diff =0;
        for (int k:arrs)
                rightSum +=k;
        rightSum -= leftSum;

        diff = Math.abs(leftSum-rightSum);
        for (int i = 1; i <arrs.length ; i++) {
            int currentdiff = diff;
            leftSum +=arrs[i];
             rightSum -= arrs[i];
             diff = Math.abs(leftSum-rightSum);
             if (diff>currentdiff) diff = currentdiff;
        }
        return diff;
    }
        public static int [] rotationCiycle(int[] arrs,int k) {
        int[] newarrs = new int[arrs.length];

        for (int i = 0; i <arrs.length ; i++) {
            newarrs[(i+k+1)%arrs.length] = arrs[i];
        }
        return  newarrs;

    }
    public static  int frogRiver(int k,int[] arrs) {
        boolean[] posarr = new boolean[k+1];
        int X = k;
        for (int i = 0; i <arrs.length ; i++) {
            int pos = arrs[i];
            if (!posarr[pos]) {
                posarr[pos] = true;
                X -=1;
                if (X==0) return i;
            }
        }
        return  X;
    }
}
