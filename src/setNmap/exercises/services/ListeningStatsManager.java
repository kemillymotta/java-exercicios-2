package setNmap.exercises.services;

import java.util.HashMap;
import java.util.Map;

public class ListeningStatsManager {

    private Map<String, Integer> listeningStats;

    public ListeningStatsManager() {
        listeningStats = new HashMap<>();
    }

    public void addListeningRecord(String artist, int scrobbles) {

        artist = normalizeArtistName(artist);

        if(scrobbles <= 0) {
            System.out.println("Enter a valid number of scrobbles.");
            return;
        }

        if(!listeningStats.containsKey(artist)) {
            listeningStats.put(artist, scrobbles);

            System.out.println("Artist added!");
        } else {
            int currentScrobbles = listeningStats.get(artist);
            listeningStats.put(artist, (currentScrobbles + scrobbles));

            System.out.println("Scrobbles updated!");
        }

    }

    public void searchArtist (String artist){

        artist = normalizeArtistName(artist);

        if (listeningStats.containsKey(artist)) {
            int scrobbles = listeningStats.get(artist);

            System.out.printf("%s has %d scrobbles%n", artist, scrobbles);
        } else {
            System.out.println("Artist not found!");
        }
    }

    public void showAllListeningStats () {

        if (listeningStats.isEmpty()) {
            System.out.println("No listening data yet.");
            return;
        }
        for(Map.Entry<String, Integer> entry : listeningStats.entrySet()) {
            System.out.printf("%s -> %d scrobbles%n", entry.getKey(), entry.getValue());
        }
    }

    public void showUniqueArtistCount () {
        System.out.println("Total unique artists: " + listeningStats.size());
    }

    public void showTotalPlays () {
        int total = 0;

        for (Integer scrobbles : listeningStats.values()) {
            total += scrobbles;
        }

        System.out.printf("Total scrobbles: %d%n", total);
    }

    private String normalizeArtistName(String artist) {
        artist = artist.trim().toLowerCase(); // removes extra spaces and converts everything to lowercase

        String[] words = artist.split(" "); // splits the artist name into separate words using spaces
        StringBuilder result = new StringBuilder(); // creates a mutable string that we can build step by step

        for (String word : words) { // goes through each word in the array
            if (!word.isEmpty()) { // ignores empty words
                String capitalized =
                        word.substring(0, 1).toUpperCase() // gets the first letter and makes it uppercase
                                + word.substring(1); // gets the rest of the word starting from index 1

                result.append(capitalized).append(" ");
                // append() adds the capitalized word to the end of result
                // and then adds a space after it
            }
        }

        return result.toString().trim();
        // toString() converts the StringBuilder into a regular String
        // trim() removes the extra space left at the end
    }



}
