package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        Book book = new Book("dat nuoc", "dat nuoc", 19.8f);
        Book dvd = new Book("anh hung", "kich tinh", 6.5f);
        CompactDisc cd = new CompactDisc("thanh xuan", "hoc duong", 5.6f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

       Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Sorted by Title, then Cost:");
        for (Media media : mediae) {
            System.out.println(media.getTitle() + " - $" + media.getCost());
        }

        // Sort by cost (descending) then by title (alphabetical)
        Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted by Cost, then Title:");
        for (Media media : mediae) {
            System.out.println(media.getTitle() + " - $" + media.getCost());
        }
    }
}
