package crud;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        CRUD c = new CRUD();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter Choice");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Fetch");
            System.out.println("5.Search");
            System.out.println("6.Exit");

            System.out.print("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    c.InsertData();
                    break;

                case 2:
                    c.UpdateData();
                    break;

                case 3:
                    c.DeleteData();
                    break;

                case 4:
                    c.FetchData();
                    break;

                case 5:
                    c.Search();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}