package com.wisdomlanna.www.dagger2_mvp_example.ui;

import com.wisdomlanna.www.dagger2_mvp_example.manager.Calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(Parameterized.class)
public class CalculatorMetricDivideTest {

    private int[] numbers = new int[3];
    private Calculator calculator = new Calculator();

    public CalculatorMetricDivideTest(int n1, int n2, int n3) {
        numbers[0] = n1;
        numbers[1] = n2;
        numbers[2] = n3;
    }

    @Parameterized.Parameters(name = "test case {index}: {0}/{1}={2}")
    public static List<Object[]> setupData() {
        return Arrays.asList(new Object[][]{
                {4, 2, 2},
                {2, 2, 1},
                {55, 5, 11},
                {1, 1, 1},
        });
    }

    @Test
    public void plus() throws Exception {
        assertThat(calculator.divide(numbers[0] , numbers[1]), is(numbers[2]));
    }
}
