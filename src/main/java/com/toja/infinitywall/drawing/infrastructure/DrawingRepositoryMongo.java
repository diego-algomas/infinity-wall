package com.toja.infinitywall.drawing.infrastructure;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import com.toja.infinitywall.drawing.infrastructure.mappers.DrawingMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class DrawingRepositoryMongo implements DrawingRepository {

    DrawingDocumentRepository repository;

    public DrawingRepositoryMongo(DrawingDocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Drawing create(Drawing drawing) {
        DrawingDocument entity = DrawingMapper.INSTANCE.toEntity(drawing);
        return DrawingMapper.INSTANCE.toDomain(repository.save(entity));
    }

    @Override
    public List<Drawing> findAll() {
        return DrawingMapper.INSTANCE.toDomains(repository.findAll());
    }
}
