package setNmap.exercises.application;

import setNmap.exercises.services.ListeningStatsManager;

import java.util.Scanner;

public class ListeningStats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListeningStatsManager stats = new ListeningStatsManager();

        int op = 0;

        while (op != 6) {
            System.out.println("\n=== MINI LAST.FM MENU ===");
            System.out.println("1 - Add listening record");
            System.out.println("2 - Search artist");
            System.out.println("3 - Show all listening stats");
            System.out.println("4 - Show unique artist count");
            System.out.println("5 - Show total plays");
            System.out.println("6 - Exit");
            System.out.print("Option: ");
            op = sc.nextInt();
            sc.nextLine();

            String artist;
            int scrobbles = 0;

            switch (op) {
                case 1:

                    do {
                        System.out.print("Artist: ");
                        artist = sc.nextLine();

                        if (artist.isBlank()) {
                            System.out.println("Enter a valid artist.");
                        }
                    } while (artist.isBlank());

                    System.out.print("Scrobbles: ");
                    scrobbles = sc.nextInt();

                    stats.addListeningRecord(artist, scrobbles);
                    break;
                case 2:
                    System.out.print("Enter artist: ");
                    artist = sc.nextLine();
                    stats.searchArtist(artist);

                    break;
                case 3:
                    stats.showAllListeningStats();
                    break;
                case 4:
                    stats.showUniqueArtistCount();
                    break;
                case 5:
                    stats.showTotalPlays();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        sc.close();
    }

}
