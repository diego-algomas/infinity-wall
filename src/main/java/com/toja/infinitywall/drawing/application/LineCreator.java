package com.toja.infinitywall.drawing.application;

import com.sun.source.tree.LineMap;
import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import com.toja.infinitywall.drawing.domain.Line;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.LineDto;
import com.toja.infinitywall.drawing.infrastructure.mappers.DrawingMapper;
import com.toja.infinitywall.drawing.infrastructure.mappers.LineMapper;
import org.springframework.stereotype.Service;

@Service
public class LineCreator {

    private DrawingRepository repository;

    public LineCreator(DrawingRepository repository) {
        this.repository = repository;
    }

    public Drawing execute(String lineId, LineDto creationDto) {
        var oldDrawing = repository.findById(lineId);
        return oldDrawing.map((value) -> {
            value.addLine(LineMapper.INSTANCE.fromLineDto(creationDto));
            return repository.update(value);
        }).orElseThrow();
    }
}
