public class bubbleShortPorseni {
    public static void main(String[] args) {

        String[][] athletes = {
            {"Budi", "Dika", "Alif", "Petpet", "RioAbdul"}, // Badminton
            {"Mera", "Chiko", "Chika", "Chuko", "Choko"}, // Tennis Table
            {"Inam", "Farrel", "Gabriel", "Gaby", "Batavia"}, // Basketball
            {"Irfan", "Ivan", "Tritwoone", "Erham", "Wida"} // Volleyball
        };

        String[] sports = {"Badminton", "Tennis Table", "Basketball", "Volleyball"};

        for (int sportIndex = 0; sportIndex < athletes.length; sportIndex++) {
            for (int i = 0; i < athletes[sportIndex].length; i++) {
                for (int j = 1; j < athletes[sportIndex].length - i; j++) {
                    if (athletes[sportIndex][j - 1].compareTo(athletes[sportIndex][j]) > 0) {
                        // Swap elements
                        String temp = athletes[sportIndex][j];
                        athletes[sportIndex][j] = athletes[sportIndex][j - 1];
                        athletes[sportIndex][j - 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted Athletes' Names:");
        for (int sportIndex = 0; sportIndex < athletes.length; sportIndex++) {
            System.out.print(sports[sportIndex] + ": ");
            for (int i = 0; i < athletes[sportIndex].length; i++) {
                System.out.print(athletes[sportIndex][i]);
                if (i < athletes[sportIndex].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Add a line break between sports
        }
    }
}
