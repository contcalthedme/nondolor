public class Main {
    public static void main(String[] args) {
        // Define and initialize a two-dimensional array of actors
        String[][] Actors = {
            {"Robert Downey Jr.", "Iron Man"},
            {"Chris Evans", "Captain America"},
            {"Scarlett Johansson", "Black Widow"},
            {"Mark Ruffalo", "Hulk"},
            {"Chris Hemsworth", "Thor"}
        };

        // Iterate through the array and print each actor and their role
        for (int i = 0; i < Actors.length; i++) {
            System.out.println("Actor: " + Actors[i][0] + ", Role: " + Actors[i][1]);
        }
    }
}
