package com.toja.infinitywall.drawing.infrastructure;

import com.toja.infinitywall.drawing.domain.Line;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class DrawingDocument {
    @Id
    private String id;

    private List<Line> lines = new ArrayList<>();

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
}