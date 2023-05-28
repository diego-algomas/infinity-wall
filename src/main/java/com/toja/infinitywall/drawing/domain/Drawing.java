package com.toja.infinitywall.drawing.domain;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private String id;

    private List<Line> lines = new ArrayList<>();

    public static Drawing createDrawing(List<Line> lines) {
        Drawing drawing = new Drawing();
        drawing.setLines(lines);
        return drawing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLines(List<Line> lines) {
        this.lines.clear();
        this.lines.addAll(lines);
    }

    public List<Line> getLines() {
        return lines;
    }


    public void addLine(Line line){
        this.lines.add(line);
    }
}
