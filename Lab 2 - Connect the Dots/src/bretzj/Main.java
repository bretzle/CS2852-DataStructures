/*
 * Course: CS2852
 * Spring 2019
 * Lab 2 - Connect the Dots
 * Name: John Bretz
 * Created: 3/8/2019
 */
package bretzj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Class
 */
public class Main extends Application {

    /**
     * Width of the window
     */
    public static final double WIDTH = 600;

    /**
     * Height of the window
     */
    public static final double HEIGHT = 600;

    /**
     * The window's stage
     */
    public static Stage stage;

    /** Base title of the stage */
    public static String title = "Lab 1 - Dot Generator";

    /**
     * JavaFX entry point
     *
     * @param primaryStage the window stage
     * @throws Exception some exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("generator.fxml"));
        primaryStage.setTitle(Main.title);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * Main method
     *
     * @param args cmd line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
