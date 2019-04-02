package com.mozhaev.test;

import com.mozhaev.SqrtEquation;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ServiceTest {

    SqrtEquation service = new SqrtEquation();

    @Test
    public void calculateTwoRoots() {
        List<Double> roots = service.solveEquation(1, -3, 2);
        Assert.assertEquals(2, roots.size());
        Assert.assertTrue(roots.contains(2.0));
    }

    @Test
    public void calculateOneRoot() {
        List<Double> roots = service.solveEquation(1, -4, 4);
        Assert.assertEquals(1, roots.size());
        Assert.assertTrue(roots.contains(2.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateNoRoots() {
        service.solveEquation(2, 0, 1);
    }
}
