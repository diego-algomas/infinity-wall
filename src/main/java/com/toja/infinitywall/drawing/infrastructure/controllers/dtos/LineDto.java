package com.toja.infinitywall.drawing.infrastructure.controllers.dtos;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class LineDto implements Serializable {

    final private List<SegmentDto> segments = new ArrayList<>();
    private String color;
    private boolean fill;
    private boolean closed;
    private double strokeWidth;

    public List<SegmentDto> getSegments() {
        return segments;
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
}