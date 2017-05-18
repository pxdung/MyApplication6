package com.learningforever.myapplication.MathPackage;

/**
 * Created by ABCD on 5/13/2017.
 */
public class Employee implements Cloneable {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void ACD() throws Exception
    {
        Employee e1=new Employee("aa",100);
        Employee e2=(Employee)e1.clone();

    }
    public Object clone()
    {
        {
            try
            {
                return super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                return null;
            }
        }
    }

}