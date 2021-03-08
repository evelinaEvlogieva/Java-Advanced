import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular= new TreeSet<>();


        while (!"PARTY".equals(input)){
            if (input.length() == 8) {
                char letter = input.charAt(0);
                if (Character.isDigit(letter)) {
                    vip.add(input);
                } else {
                    regular.add(input);
                }
            }
            input = scanner.nextLine();
        }

        while (!"END".equals(input)){
            if (input.length() == 8) {
                char letter = input.charAt(0);
                if (Character.isDigit(letter)) {
                    if (vip.contains(input)) {
                        vip.remove(input);
                    }

                } else {
                    if (regular.contains(input)) {
                        regular.remove(input);
                    }

                }
            }
            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String vips : vip) {
            System.out.println(vips);
        }

        for (String reg : regular) {
            System.out.println(reg);
        }
    }
}
