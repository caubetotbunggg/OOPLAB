package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();
        Book book = new Book("viet nam", "dat nuoc", 19.8f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("tra thu doi", "kich tinh", 6.5f);
        CompactDisc cd = new CompactDisc("thanh xuan", "hoc duong", 5.6f);

        List<Media> mediae = new ArrayList<Media>();
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m: mediae){
            System.out.println(m.toString());
        }
    }
}
