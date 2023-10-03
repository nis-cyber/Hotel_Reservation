import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class DateBooks{
    public DateBooks() throws Exception {
        File file = new File("DateBook.txt");
        PrintWriter pw = new PrintWriter(file);
        FileWriter fw = new FileWriter(file);
        //ask for check in and out time
        System.out.print("For which month would you like to book the hotel for: ");
        Scanner scan = new Scanner(System.in);
        String monthSelection = scan.nextLine().toUpperCase();
        //showing available dates on each months
        int[] availableDateJan = {};
        int[] availableDateFeb = {};
        int[] availableDateMar = {};
        int[] availableDateApr = {};
        int[] availableDateMay = {};
        int[] availableDateJun = {};
        int[] availableDateJul = {};
        int[] availableDateAug = {};
        int[] availableDateSep = {};
        int[] availableDateOct = {};
        int[] availableDateNov = {};
        int[] availableDateDec = {};
        int in = 0;
        String option = "Reservation date: ";
        switch (monthSelection){
            case "JAN":
            case "JANUARY":
            case "J":
                availableDateJan = new int[]{2, 4, 12, 26};
                //change it
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateJan.length; i++) {
                    if(i!= availableDateJan.length-1){
                        System.out.print(availableDateJan[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJan[i]);
                    }
                }
                System.out.println("");
                System.out.print("Please select a check in date: ");
                int checkIn = scan.nextInt();
                System.out.println("You have reserve a room for january" + checkIn);
                in += checkIn;
                pw.println(option + "January " + in);
                for (int i =0;i< availableDateJan.length;i++){
                    if(availableDateJan[i]==checkIn){
                        for(int j =i;j< availableDateJan.length-1;j++){
                            availableDateJan[j]= availableDateJan[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateJan.length-1;i++){
                    if(i!= availableDateJan.length-2){
                        System.out.print(availableDateJan[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJan[i]);
                    }
                }
                break;
            case "FEB":
            case "FEBRUARY":
            case "F":
                availableDateFeb = new int[]{2, 3, 1, 8, 23, 12};
                //change it
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateFeb.length; i++) {
                    if(i!= availableDateFeb.length-1){
                        System.out.print(availableDateFeb[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateFeb[i]);
                    }
                }
                System.out.println("");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for january" + checkIn);
                in += checkIn;
                pw.println(option + "February " + in);
                for (int i =0;i< availableDateFeb.length;i++){
                    if(availableDateFeb[i]==checkIn){
                        for(int j =i;j< availableDateFeb.length-1;j++){
                            availableDateFeb[j]= availableDateFeb[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateFeb.length-1;i++){
                    if(i!= availableDateFeb.length-2){
                        System.out.print(availableDateFeb[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateFeb[i]);
                    }
                }
                break;
            case "MAR":
            case "MARCH":
            case "M":
                availableDateMar = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateMar.length; i++) {
                    if(i!= availableDateMar.length-1){
                        System.out.print(availableDateMar[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateMar[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for march " + checkIn);
                in += checkIn;
                pw.println(option + "March " + in);
                for (int i =0;i< availableDateMar.length;i++){
                    if(availableDateMar[i]==checkIn){
                        for(int j =i;j< availableDateMar.length-1;j++){
                            availableDateMar[j]= availableDateMar[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateMar.length-1;i++){
                    if(i!= availableDateMar.length-2){
                        System.out.print(availableDateMar[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateMar[i]);
                    }
                }
                break;
            case "APR":
            case "APRIL":
            case "A":
                availableDateApr = new int[]{2, 4, 12, 13, 23, 26};
                for (int i = 0; i <availableDateApr.length; i++) {
                    if(i!= availableDateApr.length-1){
                        System.out.print(availableDateApr[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateApr[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for april " + checkIn);
                in += checkIn;
                pw.println(option + "April " + in);
                for (int i =0;i< availableDateApr.length;i++){
                    if(availableDateApr[i]==checkIn){
                        for(int j =i;j< availableDateApr.length-1;j++){
                            availableDateApr[j]= availableDateApr[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateApr.length-1;i++){
                    if(i!= availableDateApr.length-2){
                        System.out.print(availableDateApr[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateApr[i]);
                    }
                }
                break;
            case "MAY":
            case "MA":
                availableDateMay = new int[]{2, 4, 12, 13, 23, 26};
                for (int i = 0; i <availableDateMay.length; i++) {
                    if(i!= availableDateMay.length-1){
                        System.out.print(availableDateMay[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateMay[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for may " + checkIn);
                in += checkIn;
                pw.println(option + "May " + in);
                for (int i =0;i< availableDateMay.length;i++){
                    if(availableDateMay[i]==checkIn){
                        for(int j =i;j< availableDateMay.length-1;j++){
                            availableDateMay[j]= availableDateMay[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateMay.length-1;i++){
                    if(i!= availableDateMay.length-2){
                        System.out.print(availableDateMay[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateMay[i]);
                    }
                }
                break;
            case "JUN":
            case "JUNE":
                availableDateJun = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateJun.length; i++) {
                    if(i!= availableDateJun.length-1){
                        System.out.print(availableDateJun[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJun[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for june " + checkIn);
                in += checkIn;
                pw.println(option + "June " + in);
                for (int i =0;i< availableDateJun.length;i++){
                    if(availableDateJun[i]==checkIn){
                        for(int j =i;j< availableDateJun.length-1;j++){
                            availableDateJun[j]= availableDateJun[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateJun.length-1;i++){
                    if(i!= availableDateJun.length-2){
                        System.out.print(availableDateJun[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJun[i]);
                    }
                }
                break;
            case "JUL":
            case "JULY":
            case "JU":
                availableDateJul = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateJul.length; i++) {
                    if(i!= availableDateJul.length-1){
                        System.out.print(availableDateJul[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJul[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for july " + checkIn);
                in += checkIn;
                pw.println(option + "July " + in);
                for (int i =0;i< availableDateJul.length;i++){
                    if(availableDateJul[i]==checkIn){
                        for(int j =i;j< availableDateJul.length-1;j++){
                            availableDateJul[j]= availableDateJul[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateJul.length-1;i++){
                    if(i!= availableDateJul.length-2){
                        System.out.print(availableDateJul[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateJul[i]);
                    }
                }
                break;
            case "AUG":
            case "AUGUST":
            case "AU":
                availableDateAug = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateAug.length; i++) {
                    if(i!= availableDateAug.length-1){
                        System.out.print(availableDateAug[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateAug[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for august " + checkIn);
                in += checkIn;
                pw.println(option + "August " + in);
                for (int i =0;i< availableDateAug.length;i++){
                    if(availableDateAug[i]==checkIn){
                        for(int j =i;j< availableDateAug.length-1;j++){
                            availableDateAug[j]= availableDateAug[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateAug.length-1;i++){
                    if(i!= availableDateAug.length-2){
                        System.out.print(availableDateAug[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateAug[i]);
                    }
                }
                break;
            case "SEP":
            case "SEPTEMBER":
            case "S":
                availableDateSep = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateSep.length; i++) {
                    if(i!= availableDateSep.length-1){
                        System.out.print(availableDateSep[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateSep[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for september " + checkIn);
                in += checkIn;
                pw.println(option + "September " + in);
                for (int i =0;i< availableDateSep.length;i++){
                    if(availableDateSep[i]==checkIn){
                        for(int j =i;j< availableDateSep.length-1;j++){
                            availableDateSep[j]= availableDateSep[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateSep.length-1;i++){
                    if(i!= availableDateSep.length-2){
                        System.out.print(availableDateSep[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateSep[i]);
                    }
                }
                break;
            case "OCT":
            case "OCTOBER":
            case "O":
                availableDateOct = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateOct.length; i++) {
                    if(i!= availableDateOct.length-1){
                        System.out.print(availableDateOct[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateOct[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for october " + checkIn);
                in += checkIn;
                pw.println(option + "October " + in);
                for (int i =0;i< availableDateOct.length;i++){
                    if(availableDateOct[i]==checkIn){
                        for(int j =i;j< availableDateOct.length-1;j++){
                            availableDateOct[j]= availableDateOct[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateOct.length-1;i++){
                    if(i!= availableDateOct.length-2){
                        System.out.print(availableDateOct[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateOct[i]);
                    }
                }
                break;
            case "NOV":
            case "NOVEMBER":
            case "N":
                availableDateNov = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateNov.length; i++) {
                    if(i!= availableDateNov.length-1){
                        System.out.print(availableDateNov[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateNov[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for november " + checkIn);
                in += checkIn;
                pw.println(option + "November " + in);
                for (int i =0;i< availableDateNov.length;i++){
                    if(availableDateNov[i]==checkIn){
                        for(int j =i;j< availableDateNov.length-1;j++){
                            availableDateNov[j]= availableDateNov[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateNov.length-1;i++){
                    if(i!= availableDateNov.length-2){
                        System.out.print(availableDateNov[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateNov[i]);
                    }
                }
                break;
            case "DEC":
            case "DECEMBER":
            case "D":
                availableDateDec = new int[]{2, 4, 12, 13, 23, 26};
                System.out.println("Available dates are: ");
                for (int i = 0; i <availableDateDec.length; i++) {
                    if(i!= availableDateDec.length-1){
                        System.out.print(availableDateDec[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateDec[i]);
                    }
                }
                System.out.println(" ");
                System.out.print("Please select a check in date: ");
                checkIn = scan.nextInt();
                System.out.println("You have reserve a room for december " + checkIn);
                in += checkIn;
                pw.println(option + "December " + in);
                for (int i =0;i< availableDateDec.length;i++){
                    if(availableDateDec[i]==checkIn){
                        for(int j =i;j< availableDateDec.length-1;j++){
                            availableDateDec[j]= availableDateDec[j+1];
                        }
                    }
                }
                System.out.println("Remaining available dates are: ");
                for(int i =0;i<availableDateDec.length-1;i++){
                    if(i!= availableDateDec.length-2){
                        System.out.print(availableDateDec[i] + ", ");
                    }
                    else {
                        System.out.print(availableDateDec[i]);
                    }
                }
                break;
        }
        pw.close();
    }

}


public class Date {
    public static void main(String[] args) throws Exception {
        DateBooks obj = new DateBooks();
    }
}
