/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ermashevsky.docxmaker;

/**
 *
 * @author denic
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ru.ermashevsky.docxmaker.utils.DisplayDatabase;

public class FXDatabaseDisplay extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setFullScreen(true);
        TableView tableview;
        //TableView  
        tableview = new TableView();
        DisplayDatabase.buildData(tableview);
        //Adding GridPane  
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        //Main Scene  
        Scene scene = new Scene(tableview);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(null);
    }
}
