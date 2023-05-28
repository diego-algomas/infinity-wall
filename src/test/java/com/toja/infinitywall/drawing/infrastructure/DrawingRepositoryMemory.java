package com.toja.infinitywall.drawing.infrastructure;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
@Qualifier("DrawingRepositoryMemory")
public class DrawingRepositoryMemory implements DrawingRepository {
    List<Drawing> drawings = new ArrayList<>();

    @Override
    public Drawing create(Drawing drawing) {
        drawings.add(drawing);
        return drawing;
    }

    @Override
    public List<Drawing> findAll() {
        return drawings;
    }

    @Override
    public Optional<Drawing> findById(String id) {
        return this.drawings.stream().filter(element ->
                Objects.equals(element.getId(), id)
        ).findAny();
    }

    @Override
    public Drawing update(Drawing domainFromDto) {
        return this.drawings.stream().filter(element -> Objects.equals(element.getId(), domainFromDto.getId())).findAny().get();
    }

}
