import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static ArrayList<AuthenticationInfo> Info = new ArrayList<>();

    public static void start() {
        boolean check = true;
        int choice;
        do {
            System.out.println("Enter your choice" + '\n' + "1. New Login Info" + '\n' + "2. View Login Info" + '\n' + "3. Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // new login record
                    System.out.println("Enter URL:");
                    String url = scanner.nextLine();
                    System.out.println("Enter Username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter Password:");
                    String password = scanner.nextLine();

                    AuthenticationInfo newInfo = createLoginRecord(new AuthenticationInfo(url, username, password));
                    Info.add(newInfo);
                    System.out.println("New Login recorded.");
                    break;
                case 2: // view login record
                    System.out.println("Enter URL:");
                    String targetURL = scanner.nextLine();

                    AuthenticationInfo showInfo=viewLoginRecord(targetURL);

                    if(showInfo==null)
                        System.out.println("No Info found for this URL.");
                    else
                    {
                        System.out.println(showInfo.toString());
                    }
                    break;
                case 3:  // exit
                    check=false;
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        } while (check);
    }

    public static AuthenticationInfo createLoginRecord(AuthenticationInfo newInfo) {
        String temp = EncrypttionUtil.encrypt(newInfo.getPassword());
        newInfo.setPassword(temp);
        return newInfo;
    }

    public static AuthenticationInfo viewLoginRecord(String targetURL) {
        AuthenticationInfo showInfo = null;
        for (AuthenticationInfo targetInfo : Info) {
            if (targetInfo.getURL().equals(targetURL)) {
                return new AuthenticationInfo(targetInfo.getURL(), targetInfo.getUserName(), EncrypttionUtil.decrypt(targetInfo.getPassword()));
            }
        }
        return showInfo;
    }
}
