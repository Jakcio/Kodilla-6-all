package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {

    private ArrayList<Shape> shapeList;

    public ShapeCollector() {
        this.shapeList = new ArrayList<>();
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        this.getShapeList().add(shape);

    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(this.getShapeList().contains(shape)) {
            this.getShapeList().remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >= 0 && n < getShapeList().size()) {
            shape = getShapeList().get(n);
        }
        return shape;

    }

    public ArrayList<Shape> showFigures() {
        Iterator<Shape> iteratorArrayList = getShapeList().iterator();
        while (iteratorArrayList.hasNext()) {
            Shape currentShape = iteratorArrayList.next();
            System.out.println("Name: "+ currentShape.getShapeName() + ", field: " + currentShape.getField() + "\n");
        }

        return getShapeList();
    }


}
