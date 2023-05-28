package com.toja.infinitywall.drawing.infrastructure.controllers.dtos;


public class SegmentDto {
    private PointDto start;
    private PointDto end;
    private PointDto ct1;
    private PointDto ct2;

    public PointDto getStart() {
        return start;
    }

    public void setStart(PointDto start) {
        this.start = start;
    }

    public PointDto getEnd() {
        return end;
    }

    public void setEnd(PointDto end) {
        this.end = end;
    }

    public PointDto getCt1() {
        return ct1;
    }

    public void setCt1(PointDto ct1) {
        this.ct1 = ct1;
    }

    public PointDto getCt2() {
        return ct2;
    }

    public void setCt2(PointDto ct2) {
        this.ct2 = ct2;
    }
}
