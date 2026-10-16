// PalmerPenguinsM7.java
// Brandon Schamberg
// 10/15/2026
// Refactored Palmer Penguins analysis using object-oriented approach

import java.io.*;
import java.util.*;

public class PalmerPenguinsM7 {
    public static void main(String[] args) {
        // Create an instance of SpeciesCounter
        SpeciesCounter counter = new SpeciesCounter();

        // Read species data
        counter.readSpeciesData();

        // Initialize species count
        counter.initializeSpeciesCount();

        // Check if data is empty
        if (counter.isDataEmpty()) {
            System.out.println("Error: The file is empty or could not be read.");
            return;
        }

        // Count species occurrences
        counter.countSpecies();

        // Print results
        counter.printSpeciesCount();
    }
}
class CSVReader {
    /**
     * readFile reads a file line by line, extracts the specified column from each line, 
     * and returns an array containing the extracted values.
     *
     * @param FILE_NAME the file name to read
     * @param column the zero-based index of the column to extract
     * @return an array of extracted column values
     */
    public static String[] readFile(String FILE_NAME, int column) {
        List<String> columnValues = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (column >= 0 && column < tokens.length) {
                    columnValues.add(tokens[column]);
                } else {
                    columnValues.add("");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }

        return columnValues.toArray(new String[0]);
    }
}
