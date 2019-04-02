package com.mozhaev;

import java.util.ArrayList;
import java.util.List;

public class SqrtEquation {

    public List<Double> solveEquation(double a, double b, double c) {
        double x1, x2, d;
        List<Double> ans = new ArrayList<>();

        d = Math.pow(b, 2) - (4 * a * c);
        if (d > 0) {
            ans.add(((-1) * b + Math.sqrt(d)) / 2 * a);
            ans.add(((-1) * b - Math.sqrt(d)) / 2 * a);
        } else if (d == 0) {
            ans.add(((-1) * b) / 2 * a);
        } else
            throw new IllegalArgumentException("Discriminant is negative");

        return ans;
    }
}