/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author mahar
 */
public class App2 extends JFrame {

    // Create the interface components
    private JButton btnLoad;
    private JButton btnSave;
    private JTextArea txtReport;
    private JLabel lblYears;

    // Create ProductSales object
    private ProductSales sales = new ProductSales();

    public App2() {

        // Set window properties
        setTitle("Product Sales Application");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        // Create buttons
        btnLoad = new JButton("Load Product Data");
        btnSave = new JButton("Save Product Data");

        // Create text area
        txtReport = new JTextArea(8, 25);
        txtReport.setEditable(false);

        // Create years processed label
        lblYears = new JLabel("Years Processed: ");

        // Create button panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnSave);

        // Add components to main panel
        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(txtReport), BorderLayout.CENTER);
        panel.add(lblYears, BorderLayout.SOUTH);

        add(panel);

        // Create menu bar
        createMenu();

        // Button event handling
        btnLoad.addActionListener(e -> loadProductData());
        btnSave.addActionListener(e -> saveProductData());
    }

    // Create the application menu
    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");

        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);

        // Tools menu
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");

        // Connect menu items to button logic
        loadItem.addActionListener(e -> loadProductData());
        saveItem.addActionListener(e -> saveProductData());
        clearItem.addActionListener(e -> clearData());

        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);
    }

    // Load product data and display the report
    private void loadProductData() {

        String report = "Total Sales: "
                + sales.GetTotalSales() + "\n";

        report += "Average Sales: "
                + Math.round(sales.GetAverageSales()) + "\n";

        report += "Sales over limit: "
                + sales.GetSalesOverLimit() + "\n";

        report += "Sales under limit: "
                + sales.GetSalesUnderLimit();

        txtReport.setText(report);

        // Display the number of years processed
        lblYears.setText(
                "Years Processed: "
                + sales.GetProductsProcessed()
        );
    }

    // Save the report to data.txt
    private void saveProductData() {

        try {

            String fileContent = "DATA LOG\n"
                    + "************************************\n"
                    + txtReport.getText().replace(
                            "Sales over limit:",
                            "Sales over limit:"
                    ) + "\n"
                    + "************************************";

            Files.writeString(
                    Path.of("data.txt"),
                    fileContent
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Data saved successfully!"
            );

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error saving data: " + e.getMessage()
            );
        }
    }

    // Clear the report and years processed label
    private void clearData() {

        txtReport.setText("");
        lblYears.setText("Years Processed: ");
    }

    // Start the application
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new App2().setVisible(true);
        });
    }
}
