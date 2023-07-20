import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class TourGUI {
    private VBox mainPane;
    private List<GridPane> tourPanes;

    public TourGUI() {
        mainPane = new VBox();
        mainPane.setPadding(new Insets(10));
        mainPane.setSpacing(10);

        tourPanes = new ArrayList<>();
    }

    public VBox getMainPane() {
        return mainPane;
    }

    public void addTour(Tour tour) {
        GridPane tourPane = createTourPane(tour.getClass().getSimpleName(), tour.getTourDetails(), tour.getPricing(), tour.getDuration());
        tourPanes.add(tourPane);
        mainPane.getChildren().add(tourPane);
    }

    private GridPane createTourPane(String tourType, String[] tourDetails, Pricing pricing, String duration) {
        GridPane pane = new GridPane();
        pane.setStyle("-fx-background-color: #FFFFFF; -fx-padding: 10;");
        pane.setHgap(10);
        pane.setVgap(5);

        Label tourTitleLabel = new Label(tourType);
        tourTitleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #336699;");
        pane.add(tourTitleLabel, 0, 0, 3, 1);

        for (int i = 0; i < tourDetails.length; i++) {
            Label detailLabel = new Label(tourDetails[i]);
            pane.add(detailLabel, 0, i + 1);
        }

        Label durationLabel = new Label("Duration: " + duration);
        pane.add(durationLabel, 0, tourDetails.length + 1);
        
        Label priceLabel = new Label("Price: ");
        pane.add(priceLabel, 0, tourDetails.length + 2);

        GridPane pricingTable = createPricingTable(pricing);
        pane.add(pricingTable, 0, tourDetails.length + 3, 4, 2);

        return pane;
    }

    private GridPane createPricingTable(Pricing pricing) {
        GridPane table = new GridPane();
        table.setStyle("-fx-border-width: 1px; -fx-border-color: black; -fx-padding: 5;");
        table.setHgap(10);
        table.setVgap(5);

        for (int i = 0; i < pricing.getHeaders().length; i++) {
            Label headerLabel = new Label(pricing.getHeaders()[i]);
            headerLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #336699;");
            table.add(headerLabel, i, 0);
        }

        for (int i = 0; i < pricing.getOptions().length; i++) {
            Label optionLabel = new Label(pricing.getOptions()[i]);
            optionLabel.setStyle("-fx-background-color: #FFFFFF;");
            table.add(optionLabel, 0, i + 1);

            for (int j = 0; j < pricing.getPrices()[i].length; j++) {
                Label priceLabel = new Label(pricing.formatPrice(pricing.getPrices()[i][j]));
                priceLabel.setStyle("-fx-font-weight: bold;");
                table.add(priceLabel, j + 1, i + 1);
            }
        }

        return table;
    }
}
