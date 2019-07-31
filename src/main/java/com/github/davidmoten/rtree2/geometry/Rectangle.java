package com.github.davidmoten.rtree2.geometry;

public interface Rectangle extends Geometry, HasGeometry {

    double[] mins();

    double[] maxes();

    double volume();

    double intersectionArea(Rectangle r);

    double surfaceArea();

    Rectangle add(Rectangle r);

    boolean contains(double... x);
    
    default double min(int index) {
        return mins()[index];
    }
    
    default double max(int index) {
        return maxes()[index];
    }
    
}