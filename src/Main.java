import java.util.ArrayList;
import java.util.Collections;

class Main{

    public static void main(final String[] args) {
        ArrayList<Integer> ArrayList1, ArrayList2, ArrayList3;

        ArrayList1 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);

        ArrayList2 = new ArrayList<Integer>();
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);

        ArrayList3 = new ArrayList<Integer>();
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);

        final ArrayOrganizer organizer = new ArrayOrganizer();
        final ArrayList<Integer> sortedList = organizer.concatAndSort(ArrayList1, ArrayList2, ArrayList3);

        System.out.print("Result --> ");
        for(int i = 0; i < sortedList.size(); i++){
            System.out.print( sortedList.get(i) + " ");
        }

        System.out.println( "\nSuccessfully reverted in Git" );
    }
}