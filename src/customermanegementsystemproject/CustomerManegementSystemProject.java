package customermanegementsystemproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerManegementSystemProject {

    static ArrayList<User> users;

    static ArrayQueue<Customer> customerQueue;
    static Scanner mainScanner;

    static {
        users = new ArrayList();
        users.add(new User("Hasan", 123, false, true));
        users.add(new User("Kamal", 123, true, true));
    }

    public static void main(String[] args) {

        mainScanner = new Scanner(System.in);
        customerQueue = new ArrayQueue();

        startMainWelcomeProcess();

//       System.out.println("Welcome Employee");
//       printEmployeeMenu();
//       startEmployeeTask(null);
    }

    static void startMainWelcomeProcess() {
        System.out.println("Welcome to CompanyName,"
                + " \nPress 0 get your waiting ID. \n"
                + "If you are a registered employee, enter your username.");

        getInitialChoice(null);

    }

    static void getInitialChoice(String errorMessage) {

        if (errorMessage != null) {
            System.err.println(errorMessage);
        }

        String choice = mainScanner.next();

        if (isNumeric(choice)) {
            if (Integer.parseInt(choice) == 0) {
                int nextId;

                if (!customerQueue.isEmpty()) {
                    nextId = customerQueue.last().getQueueNumber() + 1;
                } else {
                    nextId = 1;
                }

                System.out.println("Your waiting ID is "
                        + formatId(nextId) + ";\n\n\n");

                customerQueue.enqueue(new Customer(nextId));

                startMainWelcomeProcess();
            } else {
                getInitialChoice("Please enter one of the options "
                        + "mentioned above");
            }
        } else {
            boolean wasFound = false;
            for (User user : users) {
                if (choice.equalsIgnoreCase(user.getName())) {

                    System.out.println("Hi " + user.getName()
                            + ", now enter your password:");

                    enterPassword(null, user);

                    wasFound = true;
                    break;

                }
            }
            if (!wasFound) {
                getInitialChoice("This employee doesn't exist! please "
                        + "enter a valid name");
            }

        }

    }

    static void enterPassword(String errorMessage, User user) {

        if (errorMessage != null) {
            System.err.println(errorMessage);
        }

        String password = mainScanner.next();

        if (isNumeric(password)) {

            long longPassword = Long.parseLong(password);

            if (longPassword == user.getPassword()) {
                System.out.println("Welcome " + user.getName() + ",");
                printEmployeeMenu();
                startEmployeeTask(null);
            } else {
                enterPassword("Incorrect Password!", user);
            }

        } else {
            enterPassword("Please enter a valid password!", user);
        }

    }

    static void printEmployeeMenu() {
        System.out.println("1- Serve the next customer"
                + "\n2- Check last served customer"
                + "\n3- View all served customers"
                + "\n4- View a served customer issue by ID");
    }

    static void startEmployeeTask(String errorMessage) {

        if (errorMessage != null) {
            System.err.println(errorMessage);
        }

        String option = mainScanner.next();

        if (isNumeric(option)) {
            switch (Integer.parseInt(option)) {

                case 1: {
                    ServeNextCustomer();
                }
                case 2: {
                }

                case 3: {
                }

                case 4: {
                }

                default: {
//                printEmployeeMenu();
                    startEmployeeTask("Please choose one of the options listed "
                            + "above");
                }
            }
        } else {
            startEmployeeTask("Please choose one of the options listed "
                    + "above");
        }

    }

    static void ServeNextCustomer() {

        if (customerQueue.isEmpty()) {
            System.out.println("There aren't any customers currently waiting in"
                    + " queue");
            printEmployeeMenu();
            startEmployeeTask(null);
        } else {
            Customer customer = customerQueue.dequeue();

            System.out.println("Serving customer "
                    + formatId(customer.getQueueNumber()) + ",\n");

            customer.setName(getCustomerName());

            customer.setId(getCustomerID(null));

            customer.setAddress(getCustomerAddress());

            customer.setIssue(getCustomerIssueDescription());

            System.out.println(customer.getName() + " " + customer.getId()
                    + " " + customer.getAddress() + " " + customer.getIssue());

        }

    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static String getCustomerName() {
        String name = null;
        try {

            System.out.println("Enter customer's name");

            name = mainScanner.next();

            if (isNumeric(name)) {
                throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid username!");
            return getCustomerName();
        }

        return name;
    }

    static long getCustomerID(String errorMesage) {

        if (errorMesage != null) {
            System.err.println(errorMesage);
        }
        System.out.println("Enter customer's ID");

        String id = mainScanner.next();
        if (isNumeric(id)) {
            long longId = Long.parseLong(id);
            if (longId == 0) {
                return getCustomerID("Please enter a number higher than 0");
            } else {

                if (!customerQueue.isEmpty()) {

                } else {

                }
                Customer[] customers = customerQueue.returnAll();

//                System.out.println("customer size: "+customers.length);
            
          
            case 2 -> {
                
            }    
            
            case 3 -> {
                
            }    
            
            case 4 -> {
                
            }    
 
            default -> {
//                printEmployeeMenu();
                startEmployeeTask("Please choose one of the options listed "
                        + "above");
            }
        }
        }else{
             startEmployeeTask("Please choose one of the options listed "
                    + "above");
        }

    }

    static void ServesdfsdfsfNextCustomer() {

        if (customerQueue.isEmpty()) {
            System.out.println("There aren't any customers currently waiting in"
                    + " queue");
            printEmployeeMenu();
            startEmployeeTask(null);
        } else {
            Customer customer = customerQueue.dequeue();

            System.out.println("Serving customer "
                    + formatId(customer.getQueueNumber()) + ",\n");

            customer.setName(getCustomerName());

            customer.setId(getCustomerID(null));

            customer.setAddress(getCustomerAddress());

            customer.setIssue(getCustomerIssueDescription());

            System.out.println(customer.getName() + " " + customer.getId()
                    + " " + customer.getAddress() + " " + customer.getIssue());

        }

    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static String getCustomerName() {
        String name = null;
        try {

            System.out.println("Enter customer's name");

            name = mainScanner.next();

            if (isNumeric(name)) {
                throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid username!");
            return getCustomerName();
        }

        return name;
    }

    static long getCustomerID(String errorMesage) {

        if (errorMesage != null) {
            System.err.println(errorMesage);
        }
        System.out.println("Enter customer's ID");

        String id = mainScanner.next();
        if (isNumeric(id)) {
            long longId = Long.parseLong(id);
            if (longId == 0) {
                return getCustomerID("Please enter a number higher than 0");
            } else {

                if (!customerQueue.isEmpty()) {

                } else {

                }
                Customer[] customers = customerQueue.returnAll();

//                System.out.println("customer size: "+customers.length);
                for (Customer customer : customers) {
                    if (customer == null) {
                        continue;
                    }

                    if (longId == customer.getId()) {
                        return getCustomerID("Another customer already has that"
                                + " id! please enter a different id");
                    }
                }

                return longId;
            }
        } else {
            return getCustomerID("Please enter a valid ID!");
        }
    }

    static String getCustomerAddress() {
        String address = null;
        try {

            System.out.println("Enter customer's address");

            address = mainScanner.next();

            if (isNumeric(address)) {
                throw new InputMismatchException();
            } else {

                Pattern pattern = Pattern.compile(",\\s*");
                Matcher matcher = pattern.matcher(address);
                if (!matcher.find()) {
                    System.err.println("Please enter the address in the form:"
                            + " 'City, Street or Neighbourhood'");
                    return getCustomerAddress();
                }
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid address!");
            return getCustomerAddress();
        }
        return address;
    }

    static String getCustomerIssueDescription() {
        String description = null;
        try {

            System.out.println("Issue description");

            description = mainScanner.next();

            if (isNumeric(description)) {
                throw new InputMismatchException();
            }

        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid description!");
            return getCustomerIssueDescription();
        }

        return description;
    }

    static String formatId(long id) {
        return String.format("%03d", id);
    }
}
