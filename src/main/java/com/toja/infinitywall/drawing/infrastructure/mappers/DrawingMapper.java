package com.toja.infinitywall.drawing.infrastructure.mappers;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.infrastructure.DrawingDocument;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DrawingMapper extends GMapper<DrawingDocument, Drawing, DrawingCreationDto> {
    DrawingMapper INSTANCE = Mappers.getMapper(DrawingMapper.class);
}
