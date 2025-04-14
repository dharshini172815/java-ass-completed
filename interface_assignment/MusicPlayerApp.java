package interface_assignment;
import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("Playing MP3 file...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 playback.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 playback.");
    }
}

class CDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing CD...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD...");
    }

    @Override
    public void stop() {
        System.out.println("Ejecting CD and stopping playback.");
    }
}

class StreamingPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Streaming music online...");
    }

    @Override
    public void pause() {
        System.out.println("Buffering paused.");
    }

    @Override
    public void stop() {
        System.out.println("Disconnected from streaming.");
    }
}


public class MusicPlayerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable player;

        // Choose a player
        System.out.println("Select Music Player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: player = new MP3Player(); break;
            case 2: player = new CDPlayer(); break;
            case 3: player = new StreamingPlayer(); break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Control playback
        int command;
        do {
            System.out.println("\nPlayback Options:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("0. Exit");
            command = scanner.nextInt();

            switch (command) {
                case 1: player.play(); break;
                case 2: player.pause(); break;
                case 3: player.stop(); break;
                case 0: System.out.println("Exiting player..."); break;
                default: System.out.println("Invalid command.");
            }

        } while (command != 0);

        scanner.close();
    }
}
