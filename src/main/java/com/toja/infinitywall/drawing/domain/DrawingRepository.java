package com.toja.infinitywall.drawing.domain;


import com.toja.infinitywall.drawing.infrastructure.DrawingDocument;

import java.util.List;
import java.util.Optional;

public interface DrawingRepository {
    Drawing create(Drawing drawing);

    List<Drawing> findAll();
    Optional<Drawing> findById(String id);

    Drawing update(Drawing domainFromDto);
}
