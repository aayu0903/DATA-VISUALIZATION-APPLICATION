import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataVisualizationApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Visualization Tool");

        Button barChartButton = new Button("Bar Chart");
        Button lineChartButton = new Button("Line Chart");
        Button pieChartButton = new Button("Pie Chart");

        barChartButton.setOnAction(e -> {
            ChartRenderer.renderBarChart();
        });

        lineChartButton.setOnAction(e -> {
            ChartRenderer.renderLineChart();
        });

        pieChartButton.setOnAction(e -> {
            ChartRenderer.renderPieChart();
        });

        VBox vbox = new VBox(10, barChartButton, lineChartButton, pieChartButton);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
