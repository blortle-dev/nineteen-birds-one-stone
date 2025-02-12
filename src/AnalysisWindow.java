import javax.swing.*;

public class AnalysisWindow {
    private JPanel panel1;
    private JButton analyzeButton;
    private JSpinner s1;
    private JSpinner s10;
    private JSpinner s9;
    private JSpinner s8;
    private JSpinner s7;
    private JSpinner s6;
    private JSpinner s5;
    private JSpinner s4;
    private JSpinner s3;
    private JSpinner s2;
    private JSpinner c1;
    private JSpinner c2;
    private JSpinner c3;
    private JSpinner c4;
    private JSpinner c5;
    private JSpinner c6;
    private JSpinner c7;
    private JSpinner c8;
    private JSpinner c10;
    private JSpinner c9;
    private JSpinner v9;
    private JSpinner v8;
    private JSpinner v10;
    private JSpinner v7;
    private JSpinner v6;
    private JSpinner v5;
    private JSpinner v4;
    private JSpinner v3;
    private JSpinner v2;
    private JSpinner v1;

    private final int transectWidth; // One side of the transect width. *2 for full width. IN METERS
    private final double transectLength; // Length of the transect. IN KILOMETERS

    public AnalysisWindow() {
        JFrame frame = new JFrame("AnalysisWindow");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Nineteen Birds, One Stone");

        transectWidth = 125;
        transectLength = 1;

        analyzeButton.addActionListener(_ -> {
            frame.setVisible(false);
            analyze();
        });    }

    /*
    @param transectWidth: One side of the transect width. *2 for full width. IN METERS
    @param transectLength: Length of the transect. IN KILOMETERS
     */

    public AnalysisWindow(int transectWidth, double transectLength) {
        JFrame frame = new JFrame("AnalysisWindow");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Nineteen Birds, One Stone");

        this.transectWidth = transectWidth;
        this.transectLength = transectLength;

        analyzeButton.addActionListener(_ -> {
            frame.setVisible(false);
            analyze();
        });
    }

    private String a(JSpinner in) {
        int inT = (int) in.getValue();
        int len = String.valueOf(inT).length();
        if (inT == 0) {
            return " ".repeat(6);
        }
        return inT + " ".repeat(6 - len);
    }

    private String t(JSpinner one, JSpinner two, JSpinner three, JSpinner four, JSpinner five, JSpinner six, JSpinner seven, JSpinner eight, JSpinner nine, JSpinner ten) {
        int total = (int) one.getValue() + (int) two.getValue() + (int) three.getValue() + (int) four.getValue() + (int) five.getValue() + (int) six.getValue() + (int) seven.getValue() + (int) eight.getValue() + (int) nine.getValue() + (int) ten.getValue();
        int len = String.valueOf(total).length();
        return total + " ".repeat(6 - len);
    }

    private int ti(JSpinner one, JSpinner two, JSpinner three, JSpinner four, JSpinner five, JSpinner six, JSpinner seven, JSpinner eight, JSpinner nine, JSpinner ten) {
        return (int) one.getValue() + (int) two.getValue() + (int) three.getValue() + (int) four.getValue() + (int) five.getValue() + (int) six.getValue() + (int) seven.getValue() + (int) eight.getValue() + (int) nine.getValue() + (int) ten.getValue();
    }

    private String v(JSpinner one, JSpinner two, JSpinner three) {
        int total = (int) one.getValue() + (int) two.getValue() + (int) three.getValue();
        int len = String.valueOf(total).length();
        return total + " ".repeat(6 - len);
    }

    private int vi(JSpinner one, JSpinner two, JSpinner three) {
        return (int) one.getValue() + (int) two.getValue() + (int) three.getValue();
    }

    private String add(int one, int two, int three) {
        int total = one + two + three;
        int len = String.valueOf(total).length();
        return total + " ".repeat(6 - len);
    }

    private void analyze() {
        System.out.println("ANALYSIS COMPLETE\n");
        System.out.println("||============================================================================================================||");
        System.out.println("||         | 0-5    | 5-10   | 10-15  | 15-20  | 20-25  | 25-30  | 30-35  | 35-65  | 65-95  | 95-125 | Total  ||");
        System.out.println("|| --------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|------- ||");
        System.out.println("||    Song | "+a(s1)+" | "+a(s2)+" | "+a(s3)+" | "+a(s4)+" | "+a(s5)+" | "+a(s6)+" | "+a(s7)+" | "+a(s8)+" | "+a(s9)+" | "+a(s10)+" | "+t(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10)+" ||");
        System.out.println("|| --------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|------- ||");
        System.out.println("||    Call | "+a(c1)+" | "+a(c2)+" | "+a(c3)+" | "+a(c4)+" | "+a(c5)+" | "+a(c6)+" | "+a(c7)+" | "+a(c8)+" | "+a(c9)+" | "+a(c10)+" | "+t(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10)+" ||");
        System.out.println("|| --------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|------- ||");
        System.out.println("||  Vision | "+a(v1)+" | "+a(v2)+" | "+a(v3)+" | "+a(v4)+" | "+a(v5)+" | "+a(v6)+" | "+a(v7)+" | "+a(v8)+" | "+a(v9)+" | "+a(v10)+" | "+t(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10)+" ||");
        System.out.println("|| --------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|------- ||");
        System.out.println("||   Total | "+v(s1,c1,v1)+" | "+v(s2,c2,v2)+" | "+v(s3,c3,v3)+" | "+v(s4,c4,v4)+" | "+v(s5,c5,v5)+" | "+v(s6,c6,v6)+" | "+v(s7,c7,v7)+" | "+v(s8,c8,v8)+" | "+v(s9,c9,v9)+" | "+v(s10,c10,v10)+" | "+add(ti(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10),ti(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10),ti(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10))+" ||");
        System.out.println("||============================================================================================================||");
        System.out.print("\n");
        System.out.println("         Full Detection Strip: "+findFullDetection()+" m");
        System.out.println("       # of Detections in FDS: "+fdsNum()+" birds");
        System.out.println("          Population Estimate: "+findPopulationEstimate()+" birds/hectare");
        System.out.println(" Coefficient of Detectability: "+findCoD());
        System.exit(0);
    }

    private int fdsNum() {
        int fullDetectionWidth = Integer.parseInt(findFullDetection().trim());
        int sumDetections = 0;

        for (int i = 0; i < fullDetectionWidth / 5; i++) {
            sumDetections += vi(getSpinnerByIndex(s1, i), getSpinnerByIndex(c1, i), getSpinnerByIndex(v1, i));
        }

        return sumDetections;
    }

    private String findCoD() {
        int sumAllDetections = ti(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10) +
                ti(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10) +
                ti(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);

        int fullDetectionWidth = Integer.parseInt(findFullDetection().trim());
        int sumDetections = 0;

        for (int i = 0; i < fullDetectionWidth / 5; i++) {
            sumDetections += vi(getSpinnerByIndex(s1, i), getSpinnerByIndex(c1, i), getSpinnerByIndex(v1, i));
        }

        double populationEstimateWithoutArea = (transectWidth / (double) fullDetectionWidth) * sumDetections;
        double coefficientOfDetectability = sumAllDetections / populationEstimateWithoutArea;

        return String.format("%.2f", coefficientOfDetectability);
    }

    private String findPopulationEstimate() {
        int fullDetectionWidth = Integer.parseInt(findFullDetection().trim());
        int sumDetections = 0;

        for (int i = 0; i < fullDetectionWidth / 5; i++) {
            sumDetections += vi(getSpinnerByIndex(s1, i), getSpinnerByIndex(c1, i), getSpinnerByIndex(v1, i));
        }

        double transectAreaHectares = (transectWidth * 2) * (transectLength * 1000) / 10000.0;
        double populationEstimate = (transectWidth / (double) fullDetectionWidth) * sumDetections / transectAreaHectares;

        return String.format("%.2f", populationEstimate);
    }

    private JSpinner getSpinnerByIndex(JSpinner baseSpinner, int index) {
        if (baseSpinner == s1) return new JSpinner[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10}[index];
        if (baseSpinner == c1) return new JSpinner[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10}[index];
        if (baseSpinner == v1) return new JSpinner[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v10}[index];
        throw new IllegalArgumentException("Invalid baseSpinner");
    }

    private String findFullDetection() {
        int[] totals = {vi(s1, c1, v1), vi(s2, c2, v2), vi(s3, c3, v3), vi(s4, c4, v4), vi(s5, c5, v5), vi(s6, c6, v6), vi(s7, c7, v7), vi(s8, c8, v8), vi(s9, c9, v9), vi(s10, c10, v10)};
        int[] meters = {5, 10, 15, 20, 25, 30, 35, 65, 95, 125};
        double average = totals[0];

        for (int i = 1; i < totals.length; i++) {
            double newAverage = (average * i + totals[i]) / (i + 1);
            if (totals[i] < average * 0.8) {
                return String.format("%d", meters[i - 1]);
            }
            average = newAverage;
        }
        return String.format("%d", meters[meters.length - 1]);
    }
}
