package com.chait;

public class Calc {

    public int add(int a, int b)
    { int i = a + b;
        return i;
    }

    public int sub(int a, int b)
    { int i = a - b;
        return i;
    }

    public int divide(int a, int b)
    { int i = a / b;
        return i;
    }

    public int multiple(int a, int b)
    { int i = a * b;
        return i;
    }


    public double computeCircleArea(double redius)
    {
        return Math.PI*redius*redius;
    }
}
