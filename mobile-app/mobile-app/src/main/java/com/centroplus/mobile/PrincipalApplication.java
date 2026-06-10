package com.centroplus.mobile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalApplication extends Application {

        @Override
        public void start(Stage stage) {

                try {

                        FXMLLoader loader = new FXMLLoader(
                                        getClass().getResource(
                                                        "/com/centroplus/mobile/views/MainView.fxml"));

                        Scene scene = new Scene(
                                        loader.load(),
                                        390,
                                        760);

                        scene.getStylesheets().add(
                                        getClass()
                                                        .getResource(
                                                                        "/com/centroplus/mobile/views/styles.css")
                                                        .toExternalForm());

                        stage.setTitle("CentroPlus");

                        stage.setScene(scene);

                        stage.setResizable(false);

                        stage.show();

                } catch (Exception e) {

                        System.out.println("ERROR AL INICIAR LA APP");

                        e.printStackTrace();
                }
        }

        public static void main(String[] args) {

                launch(args);
        }
}