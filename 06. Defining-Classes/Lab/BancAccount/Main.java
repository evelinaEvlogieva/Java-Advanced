package BancAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            switch (tokens.length) {
                case 1:
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case 2:
                    BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
                    break;
                case 3:
                    int id = Integer.parseInt(tokens[1]);
                    if (bankAccountMap.containsKey(id)) {
                        if ("Deposit".equals(tokens[0])) {
                            double amount = Double.parseDouble(tokens[2]);
                            bankAccountMap.get(id).deposit(amount);
                            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                        } else {
                            int years = Integer.parseInt(tokens[2]);
                            System.out.printf("%.2f%n",bankAccountMap.get(id).getInterest(years));
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

            }

            input = reader.readLine();
        }

    }
}
