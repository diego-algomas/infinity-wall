package com.toja.infinitywall.drawing.domain;

public class Segment {
    private Point start;
    private Point end;
    private Point ct1;
    private Point ct2;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getCt1() {
        return ct1;
    }

    public void setCt1(Point ct1) {
        this.ct1 = ct1;
    }

    public Point getCt2() {
        return ct2;
    }

    public void setCt2(Point ct2) {
        this.ct2 = ct2;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "start=" + start +
                ", end=" + end +
                ", ct1=" + ct1 +
                ", ct2=" + ct2 +
                '}';
    }
}
