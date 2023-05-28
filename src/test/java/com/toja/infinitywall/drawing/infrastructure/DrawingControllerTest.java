package com.toja.infinitywall.drawing.infrastructure;

import com.toja.infinitywall.drawing.domain.Drawing;
import com.toja.infinitywall.drawing.domain.DrawingRepository;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class DrawingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @LocalServerPort
    private int port;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private DrawingRepository drawingRepositoryMongo;

    @BeforeEach
    void setUp() {
        mongoTemplate.getCollection("drawings").drop();
    }

    @Test
    void testGetDrawings() {
        Drawing[] drawings = given()
                .port(port)
                .get("/drawings")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract().as(Drawing[].class);

        assertThat(drawings).isEmpty();
    }

    @Test
    void testGetDrawingsWithElements() {
        var insertedDrawing = Drawing.createDrawing(new ArrayList<>());
        drawingRepositoryMongo.create(insertedDrawing);

        Drawing[] drawings = given()
                .port(port)
                .get("/drawings")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract().as(Drawing[].class);

        assertThat(drawings).hasSize(1);
    }

    @Test
    void testPostDrawing() {
        var createdDrawing = Drawing.createDrawing(new ArrayList<>());

        Drawing drawing = given()
                .port(port)
                .body(createdDrawing)
                .contentType(ContentType.JSON)
                .post("/drawings")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .extract().as(Drawing.class);

        assertThat(drawing.getId()).isNotNull();
    }
}
