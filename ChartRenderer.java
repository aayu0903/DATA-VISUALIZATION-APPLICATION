import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartRenderer {

    public static void renderBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5, "Category 1", "Item A");
        dataset.addValue(7, "Category 1", "Item B");
        dataset.addValue(3, "Category 1", "Item C");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart Example",
                "Category",
                "Value",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        showChart(barChart);
    }

    public static void renderLineChart() {
        XYSeries series = new XYSeries("Data");
        series.add(1, 5);
        series.add(2, 7);
        series.add(3, 6);
        series.add(4, 8);
        series.add(5, 5);

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        JFreeChart lineChart = ChartFactory.createXYLineChart(
                "Line Chart Example",
                "X-Axis",
                "Y-Axis",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        showChart(lineChart);
    }

    public static void renderPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 45);
        dataset.setValue("Category B", 25);
        dataset.setValue("Category C", 30);

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Pie Chart Example",
                dataset,
                true, true, false
        );

        showChart(pieChart);
    }

    private static void showChart(JFreeChart chart) {
        ApplicationFrame frame = new ApplicationFrame("Chart");
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
