package com.toja.infinitywall.drawing.application;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrawingLister {

    final DrawingRepository repository;

    public DrawingLister(DrawingRepository repository) {
        this.repository = repository;
    }

    public List<Drawing> execute() {
        return repository.findAll();
    }
}
