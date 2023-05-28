package com.toja.infinitywall.drawing.infrastructure.mappers;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.Line;
import com.toja.infinitywall.drawing.infrastructure.DrawingDocument;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.LineDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LineMapper {
    LineMapper INSTANCE = Mappers.getMapper(LineMapper.class);

    Line fromLineDto(LineDto lineDto);
}
