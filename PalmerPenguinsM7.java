// PalmerPenguinsM7.java
// Brandon Schamberg
// 10/15/2026
// Refactored Palmer Penguins analysis using object-oriented approach


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
