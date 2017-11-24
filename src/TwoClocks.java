import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
    /**
     * Natasya Virgichalia
     * Date: 11/19/2017
     * Professor Tanes Kanchanawanchai
     * CSC-201.
     * Assignment 14.26
     * (Use the ClockPane class) This program displays two clocks.
     * The hour, minute, and second values are 4, 20, 45 for the first clock
     * and 22, 46, 15 for the second clock.
     */

    public class TwoClocks extends Application {
        @Override
        public void start(Stage primaryStage) {
            ClockPane firstClock = new ClockPane(4, 20, 45);
            ClockPane secondClock = new ClockPane(22, 46, 15);
            HBox hBox = new HBox(firstClock, secondClock);
            double width = 500;
            double height = 250;
            Scene scene = new Scene(hBox, width, height);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Two Clocks");
            primaryStage.show();
        }

    public static void main(String[] args) {
        Application.launch(args);
    }

}