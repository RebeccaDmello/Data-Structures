package LinkedList;
import java.util.Arrays;
import java.util.Scanner;

public class LListApp {
    public static void main(String[] args) {
        LList<Object> list = new LList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice > 0) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("00. Exit\n01. Add An Element\t\t02. Add An Element At Location\t\t03. Remove An Element From Location\n04. Clear The List\t\t05. Replace An Element At Location\t06. Find An Element On Location\n07. Display The List\t\t08. Find Existence Of An Element\t09. Get The List Length\n10. Is The List Empty?");
            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.next());
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter An Element To Add: ");
                    int ela = sc.nextInt();
                    list.add(ela);
                    break;
                case 2:
                    System.out.print("Enter An Element's Location To Add: ");
                    int loca = sc.nextInt();
                    System.out.print("Enter An Element To Add: ");
                    int elma = sc.nextInt();
                    list.add(loca, elma);
                    break;
                case 3:
                    System.out.print("Enter An Element's Location To Remove: ");
                    int elr = sc.nextInt();
                    System.out.println("Following Element Has Been Removed From The List: " + list.remove(elr));
                    break;
                case 4:
                    list.clear();
                    break;
                case 5:
                    System.out.print("Enter An Element's Location To Replace: ");
                    int locr = sc.nextInt();
                    System.out.print("Enter An Element To Replace: ");
                    int elmr = sc.nextInt();
                    System.out.println("Following Element Got Replaced In The List: " + list.replace(locr, elmr));
                    break;
                case 6:
                    System.out.print("Enter An Element's Location To Search In The List: ");
                    int pos = sc.nextInt();
                    System.out.println("An Element Found: " + list.getEntry(pos) + " At Location: " + pos + "");
                    break;
                case 7:
                    System.out.println(Arrays.toString(list.toArray()));
                    break;
                case 8:
                    System.out.print("Enter An Element To Check If The List Contains It: ");
                    int elmf = sc.nextInt();
                    System.out.println("Is An Element " + elmf + " Present In The List?: " + list.contains(elmf));
                    break;
                case 9:
                    System.out.println("Length Of The List Is: " + list.getLength() + "\n");
                    break;
                case 10:
                    System.out.println("Is The List Empty?: " + list.isEmpty()  + "\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("An Invalid Entry... Please Try Again...");
                    break;
            }
        }
    }
}