package com.example.ticketmachine;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenMachine extends Application {
    Group root = new Group();
    Scene scene = new Scene(root);

    ImageView ScreenBackground = new ImageView(new Image("src/assets/screen.jpg"));
    int ScreenHeight = 720;
    int ScreenWidth = 1280;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("TicketMachine");
        stage.setWidth(ScreenWidth);
        stage.setHeight(ScreenHeight);

        stage.setScene(scene);
        stage.show();
        root.getChildren().add(ScreenBackground);
    }
    public static void main(String[] args) {
        launch();
    }

}
