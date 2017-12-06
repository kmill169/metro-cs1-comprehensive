package edu.msud.cs.cs1;

public class Rectangle extends Parallelogram {

    
    Rectangle(double x, double y, double a, double b) {   	
    	super(x,y,a,b,90 * Math.PI / 180);
    }

    

    @Override
    public String toString() {
        return String.format("Rectangle: x=%f y=%f a=%f b=%f theta=%f", x, y, a, b, angleTheta);
    }
}