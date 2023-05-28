package com.toja.infinitywall.drawing.infrastructure.controllers;

import com.toja.infinitywall.drawing.application.DrawingCreator;
import com.toja.infinitywall.drawing.application.DrawingLister;
import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/drawings")
public class DrawingController {

    @Autowired
    DrawingLister lister;

    @Autowired
    DrawingCreator creator;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Drawing> getDrawings() {
        return lister.execute();
    }

    @PostMapping( consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    Drawing postDrawing(@RequestBody DrawingCreationDto creationDto) {
        System.out.println("llegando");
        return creator.execute(creationDto);
    }

}
