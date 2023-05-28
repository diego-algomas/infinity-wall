package com.toja.infinitywall.drawing.domain;


import java.util.List;

public interface DrawingRepository {
    Drawing create(Drawing drawing);

    List<Drawing> findAll();

}
