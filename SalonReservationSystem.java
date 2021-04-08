import java.io.*;

    public class SalonReservationSystem {
        public static void main(String args[]) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String user, password, yn, search, again, choice, who, what;
                int to = 0, y, z = 0, end = 0;
                int available[] = new int[6];
                int bookI[][] = new int[100][3];
                String bookS[][] = new String[100][3];
                double bookD[][] = new double[100][3];
                double pay[] = new double[20];
                double change[] = new double[20];
                String[] dest = {" ", "BENI's", "THE BEAUTY", "BEAUTY BEAUTY ", "HELLO GORGEOUS", "SHINY"};
                double[] pri = {0, 800, 700, 600, 500, 400};
                Location loc1 = new Location("Your location is on:", 40.366633, 74.640832);
                Location loc2 = new Location("Salon is on:",    42.443087, 76.488707);
                double distance = loc1.distanceTo(loc2);

                for(int i = 1; i< 4; ) {
                    System.out.print("Enter Username: ");
                    user = in.readLine();
                    System.out.print("Enter Password: ");
                    password = in.readLine();

                    //"available[]" is the STYLE AVAILABLE//
                    //store 20 in every style available [1-5]//
                    for (int o = 1; o <= 5; o++) {
                        available[o] = 20;
                    }

                    //if user and password are correct proceed to who the user is page//
                    if (user.equals("Benido") && password.equals("Princess")) {

                        for (int k = 1; k == 1; ) {
                            //the who are you MENU//
                            System.out.println("----------------------------------------------");
                            System.out.println("--- ONLINE SALON RESERVATION SYSTEM        ---");
                            System.out.println("----------------------------------------------");
                            System.out.println("--- [1] CUSTOMER                           ---");
                            System.out.println("--- [2] SALON OWNER                        ---");
                            System.out.println("----------------------------------------------");
                            System.out.println("----------------------------------------------\n");

                            for (i = 1; i == 1; ) {
                                System.out.print("ENTER WHO YOU ARE: ");
                                who = in.readLine();

                                //if who is "1" display the options for customers//
                                if (who.equals("1")) {

                                    for (int x = 1; x == 1; ) {
                                        //the MAIN MENU//
                                        System.out.println("----------------------------------------------");
                                        System.out.println("---- ONLINE SALON RESERVATION SYSTEM      ----");
                                        System.out.println("----------------------------------------------");
                                        System.out.println("---- [1] Styles                           ----");
                                        System.out.println("---- [2] Customer                         ----");
                                        System.out.println("---- [3] Billing                          ----");
                                        System.out.println("---- [4] View                             ----");
                                        System.out.println("---- [5] Location                         ----");
                                        System.out.println("---- [6] Exit                             ----");
                                        System.out.println("----------------------------------------------");
                                        System.out.println("----------------------------------------------\n");

                                        for (x = 1; x == 1; ) {
                                            System.out.print("ENTER CHOICE: ");
                                            choice = in.readLine();

                                            //if CHOICE is "1" display the STYLES//
                                            if (choice.equals("1")) {
                                                //the STYLE DETAILS//
                                                //display the "STYLE", every style "PRICE", and the Number of the style left or available //
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("---   STYLE              |PRICE |  NUMBER AVAILABLE      ---");
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("--- 1.BENI's             | 800 |    " + available[1] + " ---");
                                                System.out.println("--- 2.THE BEAUTY         | 700 |    " + available[2] + " ---");
                                                System.out.println("--- 3.BEAUTY BEAUTY      | 600 |    " + available[3] + " ---");
                                                System.out.println("--- 4.HELLO GORGEOUS     | 500 |    " + available[4] + " ---");
                                                System.out.println("--- 5.SHINY              | 400 |    " + available[5] + "  ---");
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("------------------------------------------------------------\n");
                                                System.out.println("CARD HOLDERS & STUDENTS would be given 20% DISCOUNT!!!\n");
                                                x = 0;
                                            }

                                            //if CHOICE is "2" proceed to "Customer"//
                                            else if (choice.equals("2")) {
                                                int print = 1;
                                                //First of all, display the style details //
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("---   STYLE              |PRICE|  NUMBER AVAILABLE       ---");
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("--- 1.BENI's             | 800 |   " + available[1] + "  ---");
                                                System.out.println("--- 2.THE BEAUTY         | 700 |   " + available[2] + "  ---");
                                                System.out.println("--- 3.BEAUTY BEAUTY      | 600 |   " + available[3] + "  ---");
                                                System.out.println("--- 4.HELLO GORGEOUS     | 500 |   " + available[4] + "  ---");
                                                System.out.println("--- 5.SHINY              | 400 |   " + available[5] + "  ---");
                                                System.out.println("------------------------------------------------------------");
                                                System.out.println("------------------------------------------------------------\n");
                                                System.out.println("ARD HOLDERS & STUDENTS would be given 20% DISCOUNT!!!\n");

                                                if ((available[1] == 0) && (available[2] == 0) && (available[3] == 0) && (available[4] == 0) && (available[5] == 0)) {
                                                    System.out.println("Sorry, no style(s) are available at the moment");
                                                    x = 0;
                                                }


                                                //input of Customer's Name//
                                                else {
                                                    for (x = 1; x == 1; ) {
                                                        System.out.print("\nENTER CUSTOMER'S NAME: ");
                                                        bookS[z][0] = in.readLine();
                                                        x = 0;

                                                        //if Customer's Name is already used, display error and go back to Inputing//
                                                        for (int l = 0; l < z; l++) {
                                                            if (bookS[l][0].equalsIgnoreCase(bookS[z][0])) {
                                                                System.out.println("Sorry, this customer has already made a reservation.!");
                                                                x = 1;
                                                            }
                                                        }
                                                    }

                                                    //inputing of Style//
                                                    //integers Only [1-5]//
                                                    for (x = 1; x == 1; ) {
                                                        System.out.print("ENTER STYLE [number]: ");
                                                        to = Integer.parseInt(in.readLine());

                                                        //if Inputed integers are "<1" or ">5", display error and go back to Inputing//
                                                        if (to < 1 || to > 5) {
                                                            System.out.println("Invalid Input! Enter a number between 1 and 5");
                                                            x = 1;
                                                        }
                                                        //if available style is eqaul to "Zero", display error and go back to Inputing//
                                                        for (int d = 1; d <= 5; d++) {
                                                            if (to == d) {
                                                                if (available[to] == 0) {
                                                                    System.out.println("Sorry, this style is not available!");
                                                                    x = 1;
                                                                }
                                                                x = 0;
                                                            }
                                                        }
                                                    }

                                                    //convert the integer to string//
                                                    dest = new String[]{" ", "BENI's", "THE BEAUTY", "BEAUTY BEAUTY ", "HELLO GORGEOUS", "SHINY"};
                                                    pri = new double[]{0, 800, 700, 600, 500, 400};

                                                    //converted integer to string, transfer to storage array//
                                                    bookS[z][1] = dest[to];
                                                    bookD[z][0] = pri[to];

                                                    //inputing for Number of Customer//
                                                    for (x = 1; x == 1; ) {
                                                        System.out.print("HOW MANY CUSTOMERS ARE YOU?: ");
                                                        bookI[z][0] = Integer.parseInt(in.readLine());

                                                        //subtract the available styles left from the the number inputed//
                                                        for (int p = 1; p <= 5; p++) {
                                                            if (to == p) {
                                                                print = 1;
                                                                available[to] = available[to] - bookI[z][0];

                                                                //if the subtracted available style is "<0", display error//
                                                                //add the inputed number to the subtracted style, to go back the original style//
                                                                //display the available styles and go back to the inputing//
                                                                if (available[to] < 0) {
                                                                    System.out.print("Sorry, We don't have slots available for " + bookI[z][0] + " person(s)\n");
                                                                    available[to] = available[to] + bookI[z][0];
                                                                    System.out.print("We only have " + available[to] + " slots available\n");
                                                                    x = 1;
                                                                    print = 0;
                                                                }

                                                                else {
                                                                    x = 0;
                                                                }
                                                            }
                                                        }

                                                    }

                                                    //inputing for Number of Discounted Customers//
                                                    for (x = 1; x == 1; ) {
                                                        System.out.print("HOW MANY CUSTOMERS HAVE DISCOUNT?: ");
                                                        bookI[z][1] = Integer.parseInt(in.readLine());

                                                        if (bookI[z][1] > bookI[z][0]) {

                                                            System.out.println("Invalid Input!");
                                                            System.out.println("No. of Customers are only " + bookI[z][0] + "!");
                                                            x = 1;
                                                        }

                                                        else {
                                                            break;
                                                        }
                                                    }


                                                    //print out of Customers details....
                                                    if (print == 1) {
                                                        System.out.println("\n--------------------------------------");
                                                        System.out.println("--------------------------------------");
                                                        System.out.println("---        CUSTOMER'S DETAILS        ---");
                                                        System.out.println("--------------------------------------");
                                                        System.out.println("CUSTOMER'S NAME: " + bookS[z][0]);
                                                        System.out.println("STYLE CHOSEN : " + bookS[z][1]);
                                                        System.out.println("PRICE: EUR" + bookD[z][0]);
                                                        System.out.println("NO. OF CUSTOMERS: " + bookI[z][0]);
                                                        System.out.println("NO. OF CUSTOMERS WITH DISCOUNT: " + bookI[z][1]);
                                                        System.out.println("--------------------------------------");
                                                        System.out.println("--------------------------------------\n");
                                                        bookS[z][2] = "0";
                                                        double discount = (bookD[z][0] - (bookD[z][0] * 0.2)) * bookI[z][1];
                                                        bookD[z][2] = ((bookI[z][0] - bookI[z][1]) * bookD[z][0]) + discount;
                                                        x = 0;
                                                    }
                                                    z++;
                                                }
                                            }

                                            else if (choice.equals("3")) {
                                                for (x = 1; x == 1; ) {
                                                    System.out.print("ENTER CUSTOMER'S NAME: ");
                                                    search = in.readLine();
                                                    int s = 1;
                                                    for (int b = 0; b < z; b++) {
                                                        if (search.equalsIgnoreCase(bookS[b][0])) {
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("---        CUSTOMER'S DETAILS      ---");
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("CUSTOMER'S NAME: " + bookS[b][0]);
                                                            System.out.println("STYLE CHOSEN : " + bookS[b][1]);
                                                            System.out.println("PRICE:EUR" + bookD[b][0]);
                                                            System.out.println("NO. OF CUSTOMERS: " + bookI[b][0]);
                                                            System.out.println("NO. OF CUSTOMERS WITH DISCOUNT: " + bookI[b][1]);
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("--------------------------------------");
                                                            s = 0;
                                                            x = 0;

                                                            if (bookS[b][2].equals("x")) {
                                                                System.out.println("Customer Paid Already!");
                                                                x = 0;
                                                            }

                                                            else {
                                                                bookS[b][2] = "x";


                                                                for (x = 1; x == 1; ) {
                                                                    System.out.println("\n CUSTOMER'S TOTAL PRICE: " + bookD[b][2]);
                                                                    System.out.print("ENTER AMOUNT TO PAY: ");
                                                                    pay[b] = Double.parseDouble(in.readLine());
                                                                    change[b] = pay[b] - bookD[b][2];

                                                                    if (change[b] < 0) {
                                                                        System.out.println("Invalid Input!");
                                                                        x = 1;
                                                                    }

                                                                    else {
                                                                        System.out.println("CHANGE: PRICE" + change[b]);
                                                                        System.out.println("");
                                                                        x = 0;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (s == 1) {
                                                        System.out.println("\nCUSTOMER'S NAME NOT FOUND!\n");
                                                        for (int q = 1; q == 1; ) {

                                                            System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
                                                            again = in.readLine();

                                                            if (again.equalsIgnoreCase("y")) {
                                                                q = 0;
                                                            }

                                                            else if (again.equalsIgnoreCase("n")) {
                                                                q = 0;
                                                                x = 0;
                                                            }

                                                            else {
                                                                System.out.println("\nInvalid input!\n");
                                                            }


                                                        }
                                                    }
                                                }

                                            }
                                            else if (choice.equals("4")) {


                                                for (int sx = 1; sx <= 3; ) {
                                                    System.out.print("SEARCH CUSTOMER'S NAME: ");
                                                    search = in.readLine();

                                                    int s = 1;
                                                    for (x = 0; x <= z; x++) {
                                                        if (search.equalsIgnoreCase(bookS[x][0])) {
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("---        CUSTOMER'S DETAILS      ---");
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("CUSTOMER'S NAME: " + bookS[x][0]);
                                                            System.out.println("STYLE CHOSEN  : " + bookS[x][1]);
                                                            System.out.println("PRICE: EUR" + bookD[x][0]);
                                                            System.out.println("NO. OF CUSTOMERS: " + bookI[x][0]);
                                                            System.out.println("NO. OF CUSTOMERS WITH DISCOUNT: " + bookI[x][1]);
                                                            System.out.println("TOTAL PRICE: " + bookD[x][2]);
                                                            if (bookS[x][2].equals("x")) {
                                                                System.out.println("PAY: EUR" + pay[x]);
                                                                System.out.println("CHANGE: EUR " + change[x]);
                                                                System.out.println("STATUS: PAID");
                                                            }
                                                            else {
                                                                System.out.println("STATUS: NOT PAID");
                                                            }
                                                            System.out.println("--------------------------------------");
                                                            System.out.println("--------------------------------------");
                                                            s = 0;
                                                            sx = 4;

                                                        }
                                                    }


                                                    if (s == 1) {
                                                        System.out.println("Customer's Name not found!");
                                                        sx++;
                                                    }

                                                }

                                                //location
                                            }
                                            else if (choice.equals("5")) {
                                                System.out.println(loc1);
                                                System.out.println(loc2);
                                                System.out.println("Distance is:" + " " + distance + " " + "miles");
                                            }



                                            //exit
                                            else if (choice.equals("6")) {
                                                end = 1;
                                                x = 0;
                                                System.out.println("Thank You for choosing us!");
                                            }
                                            else {
                                                System.out.println("Invalid Input!");
                                                x = 1;
                                            }
                                        }

                                        for (y = 1; y == 1; ) {
                                            if (end == 1) {
                                                break;
                                            }
                                            System.out.print("Do you want another transaction? [Y/N]: ");
                                            yn = in.readLine();

                                            if (yn.equalsIgnoreCase("y")) {
                                                x = 1;
                                                y = 0;
                                            }
                                            else if (yn.equalsIgnoreCase("n")) {
                                                System.out.println("\nThank You!!!");
                                                break;
                                            }
                                            else {
                                                System.out.println("Invalid Input!!!");
                                                y = 1;
                                            }
                                        }
                                    }


                                    //For the salon owner
                                }
                                else if (who.equals("2")) {
                                    for (int x = 1; x == 1; ) {
                                        System.out.println("-----------------------------------------------");
                                        System.out.println("--- ONLINE SALON RESERVATION SYSTEM         ---");
                                        System.out.println("-----------------------------------------------");
                                        System.out.println("--- [1] VIEW RESERVATION                    ---");
                                        System.out.println("--- [2] MAKE AN UPDATE                      ---");
                                        System.out.println("--- [3] CANCEL RESERVATION                  ---");
                                        System.out.println("--- [4] EXIT                                ---");
                                        System.out.println("-----------------------------------------------");
                                        System.out.println("-----------------------------------------------\n");

                                        for (i = 1; i == 1; ) {
                                            System.out.print("WHAT DO YOU WISH TO DO? ");
                                            what = in.readLine();


                                            //if CHOICE is "1" display the STYLES//
                                            if (what.equals("1")) {

                                                for (x = 1; x == 1; ) {

                                                    System.out.print("ENTER CUSTOMER'S NAME: ");
                                                    search = in.readLine();


                                                    for (int b = 0; b < z; b++) {
                                                        if (search.equalsIgnoreCase(bookS[b][0])) {
                                                            System.out.println("-----------------------------------------------");
                                                            System.out.println("---        CUSTOMER'S DETAILS               ---");
                                                            System.out.println("-----------------------------------------------");
                                                            System.out.println("CUSTOMER'S NAME: " + bookS[b][0]);
                                                            System.out.println("STYLE CHOSEN : " + bookS[b][1]);
                                                            System.out.println("PRICE:EUR" + bookD[b][0]);
                                                            System.out.println("NO. OF CUSTOMERS: " + bookI[b][0]);
                                                            System.out.println("NO. OF CUSTOMERS WITH DISCOUNT: " + bookI[b][1]);
                                                            System.out.println("-----------------------------------------------");

                                                            if (bookS[b][2].equals("x")) {
                                                                System.out.println("Customer Paid Already!");
                                                                x = 0;
                                                            }
                                                            else {
                                                                bookS[b][2] = "x";


                                                                for (x = 1; x == 1; ) {
                                                                    System.out.println("\n CUSTOMER'S TOTAL PRICE: " + bookD[b][2]);
                                                                    System.out.print("ENTER AMOUNT TO PAY: ");
                                                                    pay[b] = Double.parseDouble(in.readLine());
                                                                    change[b] = pay[b] - bookD[b][2];

                                                                    if (change[b] < 0) {
                                                                        System.out.println("Invalid Input!");
                                                                        x = 1;
                                                                    }
                                                                    else {
                                                                        System.out.println("CHANGE: PRICE" + change[b]);
                                                                        System.out.println("-----------------");
                                                                        x = 0;
                                                                    }


                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }


                                            //if its choice 2
                                            else if (what.equals("2")) {

                                                //convert the integer to string//
                                                System.out.println("-------------------------------------------------------------");
                                                System.out.println("---    STYLE              |PRICE |  NUMBER AVAILABLE      ---");
                                                System.out.println("-------------------------------------------------------------");
                                                System.out.println("--- 1.BENI's             | 800 |    " + available[1] + "  ---");
                                                System.out.println("--- 2.THE BEAUTY         | 700 |    " + available[2] + "  ---");
                                                System.out.println("--- 3.BEAUTY BEAUTY      | 600 |    " + available[3] + "  ---");
                                                System.out.println("--- 4.HELLO GORGEOUS     | 500 |    " + available[4] + "  ---");
                                                System.out.println("--- 5.SHINY              | 400 |    " + available[5] + "  ---");
                                                System.out.println("-------------------------------------------------------------");
                                                System.out.println("-------------------------------------------------------------\n");
                                                System.out.println("CARD HOLDERS & STUDENTS would be given 20% DISCOUNT!!!\n");
                                                System.out.println("-------------------------------------------------------------");


                                                //inputing of Style//
                                                //integers Only [1-5]//

                                                for (x = 1; true; ) {
                                                    System.out.print("ENTER STYLE [number]: ");
                                                    to = Integer.parseInt(in.readLine());

                                                    //if Inputed integers are "<1" or ">5", display error and go back to Inputing//
                                                    if (to < 1 || to > 5) {
                                                        System.out.println("Invalid Input! Enter a number between 1 and 5");
                                                        x = 1;
                                                        //if available style is eqaul to "Zero", display error and go back to Inputing//
                                                        for (int d = 1; d <= 5; d++) {
                                                            if (to == d) {
                                                                if (available[to] == 0) {
                                                                    System.out.println("Sorry, this style is not available!");
                                                                }
                                                                x = 0;
                                                            }
                                                        }
                                                    }


                                                    //convert the integer to string//

                                                    final String UpdateMessage = "What you just changed:" + " " + "\nSTYLE: " + " " + dest[to] + "\nPRICE:" + " " + pri[to];
                                                    if (to == 1) {
                                                        System.out.println(" What name would you like to replace with BENI's");
                                                        dest[1] = in.readLine();
                                                        System.out.println(" What price would you like to replace with 800?");
                                                        pri[1] = Integer.parseInt(in.readLine());
                                                        //converted integer to string, transfer to storage array//
                                                        bookS[z][1] = dest[to];
                                                        bookD[z][0] = pri[to];
                                                        System.out.println(UpdateMessage);
                                                    }
                                                    else if (to == 2) {
                                                        System.out.println(" What name would you like to replace with THE BEAUTY");
                                                        dest[2] = in.readLine();
                                                        System.out.println(" What price would you like to replace with 700?");
                                                        pri[2] = Integer.parseInt(in.readLine());
                                                        //converted integer to string, transfer to storage array//
                                                        bookS[z][1] = dest[to];
                                                        bookD[z][0] = pri[to];
                                                        System.out.println(UpdateMessage);
                                                    }
                                                    else if (to == 3) {
                                                        System.out.println(" What name would you like to replace with BEAUTY BEAUTY");
                                                        dest[3] = in.readLine();
                                                        System.out.println(" What price would you like to replace with 600?");
                                                        pri[3] = Integer.parseInt(in.readLine());
                                                        //converted integer to string, transfer to storage array//
                                                        bookS[z][1] = dest[to];
                                                        bookD[z][0] = pri[to];
                                                        System.out.println(UpdateMessage);
                                                    }
                                                    else if (to == 4) {
                                                        System.out.println(" What name would you like to replace with HELLO GORGEOUS");
                                                        dest[4] = in.readLine();
                                                        System.out.println(" What price would you like to replace with 500?");
                                                        pri[4] = Integer.parseInt(in.readLine());
                                                        //converted integer to string, transfer to storage array//
                                                        bookS[z][1] = dest[to];
                                                        bookD[z][0] = pri[to];
                                                    }
                                                    else if (to == 5) {
                                                        System.out.println(" What name would you like to replace with SHINY");
                                                        dest[5] = in.readLine();
                                                        System.out.println(" What price would you like to replace with 400?");
                                                        pri[5] = Integer.parseInt(in.readLine());
                                                        //converted integer to string, transfer to storage array//
                                                        bookS[z][1] = dest[to];
                                                        bookD[z][0] = pri[to];
                                                        System.out.println(UpdateMessage);
                                                    }
                                                    else {
                                                        System.out.println("Invalid Input!");
                                                        x = 1;
                                                    }
                                                    break;
                                                }

                                            }

                                            //Canceling a reservation
                                            else if (what.equals("3")) {
                                                end = 1;
                                                for (x = 1; x == 1; ) {
                                                    System.out.print("Enter ENTER STYLE [number] to be cancelled : ");
                                                    to = Integer.parseInt(in.readLine());

                                                    //if Inputed integers are "<1" or ">5", display error and go back to Inputing//
                                                    if (to < 1 || to > 5) {
                                                        System.out.println("Invalid Input! Enter a number between 1 and 5");
                                                        x = 1;
                                                        //if available style is eqaul to "Zero", display error and go back to Inputing//
                                                        for (int d = 1; d <= 5; d++) {
                                                            if (to == d) {
                                                                if (available[to] == 0) {
                                                                    System.out.println("Sorry, this style is not available!");
                                                                }
                                                                x = 0;
                                                            }
                                                        }
                                                    }

                                                    System.out.println("----Canceling-----");
                                                    System.out.println("----Canceling-----");
                                                    System.out.println("----Canceling-----");
                                                    System.out.println("----CANCELLED-----");
                                                    for (int m = 0; m < dest.length; m++) {
                                                        if (to == 1 || to == 2 || to == 3 || to == 4 || to == 5) {
                                                            // shifting elements
                                                            for (int j = m; j < dest.length - 1; j++) {
                                                                dest[j] = dest[j + 1];
                                                                //System.out.println(dest[j]);
                                                            }

                                                        }
                                                    }
                                                    break;
                                                }

                                            }



                                            else if (what.equals("4")) {
                                                end = 1;
                                                x = 0;
                                                System.out.println("Thank you, salon owner!");
                                            }


                                            else {
                                                System.out.println("Invalid Input!");
                                                x = 1;
                                            }

break;
                                        }
                                    }
                                }


                            }
                        }
                        i = 4;
                    }
                    else {
                        System.out.println("\nInvalid user or password!\n");
                        i++;
                    }

                }

        }
    }

