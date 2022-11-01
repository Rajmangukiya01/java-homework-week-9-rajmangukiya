package homework;

/*
Write the programme that tell you which line pass through particular stations.  Just use Zone 1 stations name
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program10 {
    String[] zone1 = {"Oxford Circus", "Green Park", "Euston Square", "Bond Street"};
    String[] jubilee = new String[]{"Green Park", "Bond Street"};
    String[] metropolitan = new String[]{"Euston square"};
    String[] central = new String[]{"Oxford Circus", "Bond Street"};

    public static void main(String[] args) {
        Program10 obj = new Program10();
        Boolean found = false;

        for (String sName : obj.zone1) {
            System.out.println(sName);
        }
        System.out.println();

        Scanner read = new Scanner(System.in);
        System.out.println("Enter London Zone 1 Station :  ");
        String station = read.nextLine();
        read.close();
        System.out.println(station);

        //Check if station is present in jubilee
        List<String> nameList = new ArrayList<>(Arrays.asList(obj.jubilee));
        if (nameList.contains(station)) {
            System.out.println("Station found on jubilee line");
            found = true;
        }
        //Check if station is present in metropolitan
        nameList = new ArrayList<>(Arrays.asList(obj.metropolitan));
        if (nameList.contains(station)) {
            System.out.println("Station found on metropolitan line");
            found = true;
        }
        //Check if station is present in central
        nameList = new ArrayList<>(Arrays.asList(obj.central));
        if (nameList.contains(station)) {
            System.out.println("Station found on central line");
            found = true;
        }
    }
}
