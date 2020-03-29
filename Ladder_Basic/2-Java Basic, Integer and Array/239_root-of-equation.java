/*
Given an equation: ax2 + bx + c = 0. Find the root of the equation.

If there are two roots, return a list with two roots in it.
If there are only one root, return a list with only one root in it.
If there are no root for the given equation, return an empty list.
*/

public class Solution {
    /*
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // write your code here
        double rootElement = b*b - 4*a*c;
        if (rootElement<0) {
            return new double[0];
        }
        else if (rootElement==0) {
            double[] result = new double[1];
            result[0] = -b/(2.0*a);
            return result;
        }
        else {
            double[] result = new double[2];
            double rootSqrt = Math.sqrt(rootElement);
            result[0] = (-b-rootSqrt)/(2.0*a);
            result[1] = (-b+rootSqrt)/(2.0*a);
            if (result[0]>result[1]) {
                double temp = result[0];
                result[0] = result[1];
                result[1] = temp;
            }
            return result;
        }
    }
}