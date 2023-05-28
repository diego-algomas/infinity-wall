package com.toja.infinitywall.drawing.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Segment> segments = new ArrayList<>();
    private String color;
    private boolean fill;
    private boolean closed;
    private double strokeWidth;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments.clear();
        this.segments.addAll(segments);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    @Override
    public String toString() {
        return "Line{" +
                "segments=" + segments +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                ", closed=" + closed +
                '}';
    }
}
