package com.mm;

import com.mm.view.ViewFactory;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher<parameters, inputLine> extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();
    }
}
