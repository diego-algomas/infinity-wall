package com.toja.infinitywall.drawing.infrastructure.controllers;

import com.toja.infinitywall.drawing.application.DrawingCreator;
import com.toja.infinitywall.drawing.application.DrawingLister;
import com.toja.infinitywall.drawing.application.LineCreator;
import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.LineDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/drawings")
public class DrawingController {

    @Autowired
    DrawingLister lister;

    @Autowired
    DrawingCreator creator;

    @Autowired
    LineCreator lineCreator;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Drawing> getDrawings() {
        return lister.execute();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    Drawing postDrawing(@RequestBody DrawingCreationDto creationDto) {
        return creator.execute(creationDto);
    }

    @PatchMapping(consumes = "application/json", path = "/{drawingId}")
    @ResponseStatus(HttpStatus.OK)
    Drawing addLinesDrawing(@RequestBody LineDto lineCreateDto, @PathVariable String drawingId) {
        return lineCreator.execute(drawingId, lineCreateDto);
    }

}
