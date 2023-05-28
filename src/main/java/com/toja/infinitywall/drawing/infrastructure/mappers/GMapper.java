package com.toja.infinitywall.drawing.infrastructure.mappers;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.infrastructure.controllers.dtos.DrawingCreationDto;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

import java.util.List;

public interface GMapper<Entity, Domain, Dto> {
    Domain toDomain(Entity e);
    Entity toEntity(Domain d);

    List<Domain> toDomains(List<Entity> e);
    List<Entity> toEntities(List<Domain> d);

    Domain toDomainFromDto(Dto dto);
}
