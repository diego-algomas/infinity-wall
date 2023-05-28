package com.toja.infinitywall.drawing.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DrawingDocumentRepository extends MongoRepository<DrawingDocument, String> {
}
