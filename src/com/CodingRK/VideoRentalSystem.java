package com.CodingRK;

import java.util.*;
class Video {
    private String title;
    private boolean available;

    public Video(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnVideo() {
        available = true;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", available=" + available +
                '}';
    }
}

class RentalSystem {
    private List<Video> videos;

    public RentalSystem() {
        videos = new ArrayList<>();
    }

    public void addVideo(String title) {
        videos.add(new Video(title));
        System.out.println("Video added: " + title);
    }

    public void rentVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equalsIgnoreCase(title) && video.isAvailable()) {
                video.rent();
                System.out.println("Video rented: " + title);
                return;
            }
        }
        System.out.println("Video not available for rent: " + title);
    }

    public void returnVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equalsIgnoreCase(title) && !video.isAvailable()) {
                video.returnVideo();
                System.out.println("Video returned: " + title);
                return;
            }
        }
        System.out.println("Video not found or already returned: " + title);
    }

    public void displayInventory() {
        System.out.println("Video Inventory:");
        for (Video video : videos) {
            System.out.println(video);
        }
    }
}

public class VideoRentalSystem {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Video\n2. Rent Video\n3. Return Video\n4. Display Inventory\n5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter video title: ");
                    String title = scanner.nextLine();
                    rentalSystem.addVideo(title);
                    break;

                case 2:
                    System.out.print("Enter video title to rent: ");
                    title = scanner.nextLine();
                    rentalSystem.rentVideo(title);
                    break;

                case 3:
                    System.out.print("Enter video title to return: ");
                    title = scanner.nextLine();
                    rentalSystem.returnVideo(title);
                    break;

                case 4:
                    rentalSystem.displayInventory();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

