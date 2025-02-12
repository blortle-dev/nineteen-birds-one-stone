public class Main {
    public static void main(String[] args) {

        // CONFIGURATION
        // Tune the variables to match your transect description.

        final int transectWidth = 125; // One side of the transect width, in meters.
        final double transectLength = 0.8; // Length of the transect, in kilometers.

        // END CONFIGURATION

        System.out.println("Starting program...");
        new AnalysisWindow(transectWidth, transectLength);
    }
}