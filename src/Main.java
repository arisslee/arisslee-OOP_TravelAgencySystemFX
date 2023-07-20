import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create instances of tours
        Tour overseasTour = new OverseasTour("Korea", "Seoul", true, true, "6 days",
                new Pricing(
                        new String[]{"Options", "Normal", "Peak"},
                        new String[]{"Adult", "Child With Extra Bed", "Child With No Extra Bed", "Infant"},
                        new double[][]{
                                {4297.0, 5097.0},
                                {4097.0, 4897.0},
                                {3897.0, 4697.0},
                                {500.0, 500.0}
                        }));

        Tour domesticTour = new DomesticTour("Sabah", true, false, "3 days",
                new Pricing(
                        new String[]{"Options", "Normal", "Peak"},
                        new String[]{"Adult", "Child With Extra Bed", "Child With No Extra Bed", "Infant"},
                        new double[][]{
                                {1647.0, 2447.0},
                                {1447.0, 2247.0},
                                {1247.0, 2047.0},
                                {500.0, 500.0}
                        }));

        // Display tour information in GUI
        TourGUI tourGUI = new TourGUI();
        tourGUI.addTour(overseasTour);
        tourGUI.addTour(domesticTour);

        Scene scene = new Scene(tourGUI.getMainPane(), 650, 700);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Travel Agency System");
        primaryStage.show();
    }
}
