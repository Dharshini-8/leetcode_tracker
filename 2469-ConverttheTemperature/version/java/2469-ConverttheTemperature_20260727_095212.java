// Last updated: 7/27/2026, 9:52:12 AM
1
2    class Solution {
3    public double[] convertTemperature(double celsius) {
4        double kelvin = celsius + 273.15;
5        double fahrenheit = celsius * 1.80 + 32.00;
6
7        return new double[]{kelvin, fahrenheit};
8    }
9}