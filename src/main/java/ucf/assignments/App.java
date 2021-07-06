package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("agenda.fxml"));
            Parent root1 = FXMLLoader.load(getClass().getResource("todolist.fxml"));


            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Agenda");


            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
