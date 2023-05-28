package com.toja.infinitywall.drawing.infrastructure.controllers.dtos;


import java.io.Serializable;
import java.util.List;


public class DrawingCreationDto implements Serializable {
    private List<LineDto> lines;

    public List<LineDto> getLines() {
        return lines;
    }

    public void setLines(List<LineDto> lines) {
        this.lines = lines;
    }
}