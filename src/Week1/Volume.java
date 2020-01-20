package Week1;

import java.text.DecimalFormat;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
public class Volume {

    // calculate volume of sphere with specified diameter
    public static double volumeSphere(double d) {
        double volume;
        volume = (Math.PI * Math.pow(d, 3))/6;
        return volume;
    }

    // calculate volume of cylinder with specified diameter and height
    public static double volumeCylinder(double d, double h) {
        double volume;
        volume = (Math.PI * Math.pow(d, 2) * h)/ 4;
        return volume;
    }
    public static void main(String[] arg) {
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Sphere Diameter 10 has a volume of "
                + df.format(volumeSphere(10)));
        System.out.println("Cylinder Diameter 10, height 10 has a volume of "
        +df.format(volumeCylinder(10, 10)));


    }// main
}// class
