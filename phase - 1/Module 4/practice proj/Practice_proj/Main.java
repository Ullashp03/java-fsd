package Practice_proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();
    }

    private static void optionsSelection() {
        ArrayList<Integer> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Review my expenditure");
            System.out.println("2. Add my expenditure");
            System.out.println("3. Delete my expenditure");
            System.out.println("4. Sort the expenditures");
            System.out.println("5. Search for a particular expenditure");
            System.out.println("6. Close the application");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your saved expenses are listed below: \n" + expenses + "\n");
                    break;
                case 2:
                    System.out.print("Enter the value to add your Expense: ");
                    int value = scanner.nextInt();
                    expenses.add(value);
                    System.out.println("Your value is updated.\n");
                    break;
                case 3:
                    System.out.println("You are about to delete all your expenses! Confirm again (1 for Yes, 2 for No): ");
                    int confirm = scanner.nextInt();
                    if (confirm == 1) {
                        expenses.clear();
                        System.out.println("All your expenses are erased!\n");
                    } else {
                        System.out.println("Deletion canceled.\n");
                    }
                    break;
                case 4:
                    Collections.sort(expenses);
                    System.out.println("Expenses sorted in ascending order.\n");
                    break;
                case 5:
                    System.out.print("Enter the expense you need to search: ");
                    int searchExpense = scanner.nextInt();
                    if (expenses.contains(searchExpense)) {
                        System.out.println("Expense found in the list.\n");
                    } else {
                        System.out.println("Expense not found in the list.\n");
                    }
                    break;
                case 6:
                    closeApp();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
                    break;
            }
        }
    }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        System.exit(0);
    }
}
