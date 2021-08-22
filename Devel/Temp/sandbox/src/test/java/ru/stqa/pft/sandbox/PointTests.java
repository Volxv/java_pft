package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PointTests {
  @Test
  public void testZeroDistance() {
    Point a = new Point(1, 1);
    Point b = new Point(1, 1);
    Assert.assertEquals(a.distance(b), 0.0);
  }

  @Test
  public void testNonDecimalDistance() {
    Point a = new Point(0, 3);
    Point b = new Point(4, 0);
    Assert.assertEquals(a.distance(b), 5.0);
  }

  @Test
  public void testDecimalDistance() {
    Point a = new Point(2, 3);
    Point b = new Point(6, 10);
    double result = BigDecimal.valueOf(a.distance(b)).setScale(6, RoundingMode.HALF_UP).doubleValue();
    Assert.assertEquals(result, 8.062258);
  }
}