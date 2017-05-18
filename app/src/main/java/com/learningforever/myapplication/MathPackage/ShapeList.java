package com.learningforever.myapplication.MathPackage;

import java.util.ArrayList;

/**
 * Created by ABCD on 5/14/2017.
 */
public class ShapeList {

    public ArrayList<iShape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<iShape> shapes) {
        this.shapes = shapes;
    }
    private ArrayList<iShape> shapes=new ArrayList<iShape>();

}
