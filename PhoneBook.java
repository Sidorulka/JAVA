import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> phoneNums = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNums.add(phoneNum);
        phoneBook.put(name, phoneNums);
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> phonebook) {
        for (var item : phoneBook.entrySet()) {
            String phoneNums = "";
            for (int el : item.getValue()) {
                phoneNums = phoneNums + el + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phoneNums);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", 121345);
        phoneBook.add("Ivanov", 5235);
        phoneBook.add("Petrov", 8545);
        phoneBook.add("Ivanov", 1345);
        phoneBook.add("Sidorov", 96358);
        phoneBook.add("Petrov", 121855);
        printBook(PhoneBook.phoneBook);

    }

}