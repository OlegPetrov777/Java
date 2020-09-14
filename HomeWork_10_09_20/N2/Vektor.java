// №2
package com.company.N2;
import java.util.Scanner;
public class Vektor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x,y,z,x2,y2,z2,sp=0,sp12;
        float vl = 0, cos_v = 0, vl1,vl2,coss=0;
        int a=0,b=0,c=0;
        int[] vp = new int[3];
        int[] sum = new int[3];
        int[] minus = new int[3];

        System.out.println("Enter x,y,z ");
        x = num.nextInt();
        y = num.nextInt();
        z = num.nextInt();
        vector_length(x,y,z,vl);

        System.out.println("Enter x2, y2, z2 ");
        x2 = num.nextInt();
        y2 = num.nextInt();
        z2 = num.nextInt();
        scal_proizv(x,y,z,x2,y2,z2,sp);

        vectro_proizv(x,y,z,x2,y2,z2,vp);

        vl1 = vector_length(x,y,z,vl); vl2 =vector_length(x2,y2,z2,vl); sp12 = scal_proizv(x,y,z,x2,y2,z2,sp);
        cosines(vl1,vl2,sp12,coss);

        summ(x,y,z,x2,y2,z2,sum);
        minuss(x,y,z,x2,y2,z2,minus);

    }

    private static int[] minuss(int x, int y, int z, int x2, int y2, int z2, int[] minus) {
        minus[0] = x-x2; minus[1] = y-y2; minus[2] = z-z2;
        System.out.println("Разность равна ("+minus[0]+", "+minus[1]+", "+minus[2]+")"+"\n");
        return minus;
    }

    private static int[] summ(int x, int y, int z, int x2, int y2, int z2, int[] sum) {
        sum[0] = x+x2; sum[1] = y+y2; sum[2] = z+z2;
        System.out.println("Сумма равна ("+sum[0]+", "+sum[1]+", "+sum[2]+")"+"\n");
        return sum;
    }

    private static float cosines(float vl1, float vl2, int sp12,float coss) {
        coss = sp12/(Math.abs(vl1)*Math.abs(vl2));
        System.out.println("Косинус угла между векторами равен "+ coss+"\n");
        return coss;
    }

    private static int[] vectro_proizv(int x, int y, int z, int x2, int y2, int z2, int[] vp) {
        vp[0] = y*z2 - z*y2; vp[1] = z*x2 - x*z2; vp[2] = x*y2 - y*z2;
        System.out.println("Векторное произведение с другим вектором ("+vp[0]+", "+vp[1]+", "+vp[2]+")"+"\n");
        return vp;
    }

    private static int scal_proizv(int x, int y, int z, int x2, int y2, int z2, int sp) {
        sp = x*x2 + y*y2 + z*z2;
        System.out.println("Скалярное произвеение равно "+sp+"\n");
        return sp;
    }

    private static float vector_length(int x, int y, int z, float vl) {
        vl = (float) Math.sqrt(x*x + y*y + z*z);
        System.out.println("Длина весктора равна  "+vl+"\n");
        return vl;
    }
}
