package com.toja.infinitywall.drawing.application;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import com.toja.infinitywall.drawing.infrastructure.mappers.DrawingMapper;
import org.springframework.stereotype.Service;

@Service
public class DrawingCreator {

    private DrawingRepository repository;

    public DrawingCreator(DrawingRepository repository) {
        this.repository = repository;
    }

    public Drawing execute(DrawingCreationDto creationDto) {
        return repository.create(DrawingMapper.INSTANCE.toDomainFromDto(creationDto));
    }
}
