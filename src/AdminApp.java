import java.util.*;
import java.util.stream.Collectors;

public class AdminApp {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                                                             |");
        System.out.println("|            FeedBack Management System Admin                 |");
        System.out.println("|                                                             |");
        System.out.println("--------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        int choice;

        HashMap<Integer, String> listOfProducts = App.getIndex();

        // generate file paths of all products
        List<String> listOfProductFilePaths = listOfProducts.values().stream()
                .map(s -> {
                    return "res/" + s.replace(" ", "_") + ".csv";
                }).toList();

        while(keepGoing) {
            System.out.println("Please Enter your choice");
            System.out.println("1) See All Product Feedback ");
            System.out.println("2) See Particular Product Feedback");
            System.out.println("3) Most Good Feedback Product");
            System.out.println("4) Least Good Feedback Product ");
            choice = input.nextInt();

            switch (choice) {
                case 1 : {

                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                default: {
                    keepGoing = false;
                }
            }


        }


        input.close();
    }

    static class calculateAverageRatingThread implements Runnable{
       @Override
       public void run(){

       }
    }

}
