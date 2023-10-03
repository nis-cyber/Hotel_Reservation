import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
class OtherService{
    public OtherService(){
        System.out.println(services());
        packageSelection();
        //asking the user how many packages they want to choose
        System.out.println("Do you wanna chose single package or multiple packages? ");
        System.out.println("Please enter (O) for single package and (M) for multiple packages");
        Scanner scan1 = new Scanner(System.in);
        String choice = scan1.nextLine().toUpperCase();
        //For single package
        if(choice.equals("O")){
            System.out.println("Which package do you wanna chose");
            Scanner scan = new Scanner(System.in);
            int packageChose = scan.nextInt();
            pp(packageChose);
            if(packageChose == 1){
                foodsAvailable();
            }
            else if(packageChose == 2){
                WiFiTypes();
                System.out.println("You can chose the mbps after coming to hotel.");
            }
            else if(packageChose == 3){
                SwimmingPool();
            }
            else if(packageChose == 4){
                RoomService();
            }
        }
        //For multiple packages
        else if (choice.equals("M")){
            System.out.println("How many packages do you wanna chose, 1, 2, 3 or 4?");
            System.out.print("Number of selection: ");
            Scanner scan = new Scanner(System.in);
            int selctionNumber = scan.nextInt();
            if (selctionNumber == 2){
                System.out.println("Which which packages do you wanna chose");
                int packageChose1 = scan.nextInt();
                int packageChose2 = scan.nextInt();
                pp2(packageChose1, packageChose2);
                if (packageChose1 == 1 || packageChose1 == 2 || packageChose1 == 3 || packageChose1==4 && packageChose2==1||packageChose2 == 2 ||packageChose2==3|| packageChose2 == 4){
                    if(packageChose1 == 1 && packageChose2 == 2){
                        foodsAvailable();
                        System.out.println("");
                        WiFiTypes();
                    }
                    else if(packageChose1 == 1 && packageChose2 == 3){
                        foodsAvailable();
                        SwimmingPool();
                    }
                    else if(packageChose1 == 1 && packageChose2 == 4){
                        foodsAvailable();
                        RoomService();
                    }
                    else if(packageChose1 == 2 && packageChose2 == 1){
                        WiFiTypes();
                        foodsAvailable();
                    }
                    else if(packageChose1 == 2 && packageChose2 == 3){
                        WiFiTypes();
                        SwimmingPool();
                    }
                    else if(packageChose1 == 2 && packageChose2 == 4){
                        WiFiTypes();
                        RoomService();
                    }
                    else if(packageChose1 == 3 && packageChose2 == 1){
                        SwimmingPool();
                        foodsAvailable();
                    }
                    else if(packageChose1 == 3 && packageChose2 == 2){
                        SwimmingPool();
                        WiFiTypes();
                    }

                    else if(packageChose1 == 3 && packageChose2 == 4){
                        SwimmingPool();
                        RoomService();
                    }
                    else if(packageChose1 == 4 && packageChose2 == 1){
                        RoomService();
                        foodsAvailable();
                    }
                    else if(packageChose1 == 4 && packageChose2 == 2){
                        RoomService();
                        WiFiTypes();
                    }

                    else if(packageChose1 == 4 && packageChose2 == 3){
                        RoomService();
                        SwimmingPool();
                    }
                }
            }
            else if(selctionNumber == 3){
                System.out.println("Which which packages do you wanna chose");
                int packageChose1 = scan.nextInt();
                int packageChose2 = scan.nextInt();
                int packageChose3 = scan.nextInt();
                pp3(packageChose1,packageChose2,packageChose3);
                if(packageChose1==1||packageChose1==2||packageChose1==3||packageChose1==4 &&packageChose2==1||packageChose2==2||packageChose2==3||packageChose2==4&&packageChose3==1||packageChose3==2||packageChose3==3||packageChose3==4){
                    if(packageChose1 == 1 && packageChose2 == 2 && packageChose3==3){
                        foodsAvailable();
                        WiFiTypes();
                        SwimmingPool();
                    }
                    else if(packageChose1 == 1 && packageChose2 == 2 && packageChose3 == 4){
                        foodsAvailable();
                        WiFiTypes();
                        RoomService();
                    }
                    else if(packageChose1 == 2 && packageChose2 == 3 && packageChose3==4){
                        WiFiTypes();
                        SwimmingPool();
                        RoomService();
                    }
                }
                else {
                    System.out.println("Invalid");
                }

            }
            else if(selctionNumber==4){
                foodsAvailable();
                System.out.println("");
                WiFiTypes();
                System.out.println("");
                SwimmingPool();
                System.out.println("");
                RoomService();
            }
            else{
                System.out.println("Invalid number.");
            }
        }
    }
    // creating a method of type arraylist
    public static ArrayList services(){
        ArrayList servicesList = new ArrayList();
        servicesList.add("Food");
        servicesList.add("WiFi");
        servicesList.add("Swimming Pool");
        servicesList.add("Room Service");
        return servicesList;
    }
    //printing the services available
    public static void packageSelection(){
        ArrayList items = services();
        for(int i=0;i<4;i++){
            System.out.println(i+1 + ". " + items.get(i));
            System.out.println(" ");
        }
    }
    //creating a method with arguments, for selecting the packages
    public static void  pp(int num){
        ArrayList pack = services();
        System.out.println(pack.get(num-1));
    }
    public static void  pp2(int num1, int num2){
        ArrayList pack = services();
        System.out.println(pack.get(num1-1));
        System.out.println(pack.get(num2-1));
    }
    public static void  pp3(int num1, int num2, int num3){
        ArrayList pack = services();
        System.out.println(pack.get(num1-1));
        System.out.println(pack.get(num2-1));
        System.out.println(pack.get(num3-1));
    }
    // printing the details of whats included in the service with its price
    public static String[] foodsAvailable() {
        String[] foods = {"Breakfast", "Lunch", "Snacks", "Dinner"};
        int[] price = {1000, 2000, 3000, 4500};
        for (int i = 0; i < foods.length; i++) {
            System.out.println("For " + foods[i] + " the price is " + price[i]);
        }
        return foods;
    }
    public static String[] WiFiTypes() {
        String[] wifi = {"40mps", "100mbps", "60mbps", "25mbps"};
        int[] price = {800, 1200, 950, 500};
        for (int i = 0; i < wifi.length; i++) {
            System.out.println("For " + wifi[i] + " the price is " + price[i]);
        }
        return wifi;
    }
    public static String[] SwimmingPool() {
        String[] swimmingTime = {"morning", "Noon", "Evening", "Night"};
        System.out.println("The swimming pool is free");
        return swimmingTime;
    }
    public static String[] RoomService() {
        String[] roomServices = {"Cleaning", "Food Delivery", "Both cleaning and food delivery"};
        int[] price = {1000, 500, 1300};
        for (int i = 0; i < roomServices.length; i++) {
            System.out.println("For " + roomServices[i] + " the price is " + price[i]);
        }
        return roomServices;
    }

}

public class Hotel {
    static PrintWriter pw;
    static FileWriter fw;
    public static void main(String[]args) throws Exception{
        File file = new File("Reservation.txt");
        fw = new FileWriter(file);
        pw = new PrintWriter(file);
        //greeting the user
        System.out.println("Welcome to the Jhapa Hotel");
        System.out.println("Would you like to make a reservation at our hotel?");
        //asking for reservation input.
        System.out.print("Please enter (Y) for yes and (N) for no: ");
        Scanner scan = new Scanner(System.in);
        char choice = scan.next().toUpperCase().charAt(0);
        if (choice == 'Y') {
            System.out.println("");
            hotelRooms();
            System.out.println("Which room would you like to book?");
            System.out.println("(S) for Single, (D) for Double, (Q) for Queen, (E) for Executive Suite and (R) for Royal.");
            result();
        }
        else{
            System.out.println("Thanks for visiting");
        }

    }
    //Hotel Rooms and its price
    public static String[] hotelRooms() {
        String[] rooms = {"Single", "Double", "Queen", "Executive Suite", "Royal"};
        int[] price = {1000, 2000, 3000, 4500, 6000};
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("For " + rooms[i] + " room the price is " + price[i]);
        }
        return rooms;
    }
    public static char roomBook(){
        char name = choices();
        char n =name;
        if(n=='S'){
            pw.println("Room Type: Single Room" );
        }
        else if (n =='D'){
            pw.println("Room Type: Double Room");
        }
        else if (n =='Q'){
            pw.println("Room Type: Queen Room");
        }
        else if (n =='R'){
            pw.println("Room Type: Royal Room");
        }
        else if (n =='E'){
            pw.println("Room Type: Executive Suite Room");
        }

        return n;
    }

    //Asking the user to chose a room
    public static char choices(){
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        char userChoice1 = scan.next().toUpperCase().charAt(0);
        char roomName = userChoice1;
        return roomName;
    }
    //confirming the reservation
    public static void confirmationDetail(){
        System.out.println("For confirmation we will need your details");
        System.out.print("Your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print("Contact info: ");
        int number = scan.nextInt();
        System.out.print("Address: ");
        Scanner ad = new Scanner(System.in);
        String address = ad.nextLine();
        pw.println("Name: " + name);
        pw.println("Number: " + number);
        pw.println("Address: " + address);
    }
    public static void result() throws Exception {
        switch (roomBook()){
            case 'S':
            case 'D':
            case 'Q':
            case'R':
            case'E':
                DateBooks obj = new DateBooks();
                System.out.println("");
                System.out.println("Extra Services: ");
                OtherService obj1 = new OtherService();
                confirmationDetail();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        pw.close();
    }

}

