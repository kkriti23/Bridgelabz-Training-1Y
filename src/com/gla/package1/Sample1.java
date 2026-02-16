package com.gla.package1;

public class Sample1 {
    private int varA;
    private static int varB;
    private void methodA(){}
    private static void methodB(){}

    int varC;
    static int varD;
    void methodC(){}
    static void methodD(){}

    public int varE;
    public static int varF;
    public void methodE(){}
    public static void methodF(){}

    protected int varG;
    protected  static int varH;
    protected void methodG(){}
    protected static void methodH(){}

    static void main() {
        System.out.println(varB);
        Sample1 obj = new Sample1();
        System.out.println(obj.varA);
        methodB();
        obj.methodA();
        System.out.println(varD);
        System.out.println(obj.varC);
        methodD();
        obj.methodC();
        System.out.println(varF);
        System.out.println(obj.varE);
        methodF();
        obj.methodE();

        System.out.println(varH);
        System.out.println(obj.varG);
        methodH();
        obj.methodG();

        Student obj1 = new Student();
        obj1.setName("Kriti");
        obj1.name="Hello";
        System.out.println(obj1.getName());
    }
}
