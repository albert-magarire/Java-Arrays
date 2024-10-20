public class App {
    public static void main(String[] args) {
        MyList list = new MyArrayList();

        // Create and add Strings
        System.out.println("Adding 5 strings: 'AAAA', 'BBBB', 'CCCC', 'DDDD', 'EEEE'");
        list.add("AAAA");
        list.add("BBBB");
        list.add("CCCC");
        list.add("DDDD");
        list.add("EEEE");
        System.out.println("List: " + list);

        // Insert another string at location 2
        System.out.println("Inserting 'FFFF' at index 2");
        list.add(2, "FFFF");
        System.out.println("List: " + list);

        // Remove string at location 0
        System.out.println("Removing string at index 0");
        list.remove(0);
        System.out.println("List: " + list);

        // Set a new string at location 1
        System.out.println("Setting 'GGGG' at index 1");
        list.set(1, "GGGG");
        System.out.println("List: " + list);

        // Check if a certain string is present
        String searchString = "DDDD";
        System.out.println("Checking if '" + searchString + "' is present in the list.");
        if (list.contains(searchString)) {
            System.out.println("'" + searchString + "' is present.");
        } else {
            System.out.println("'" + searchString + "' is not present.");
        }

        // Find the index of a certain string
        searchString = "EEEE";
        System.out.println("Finding index of '" + searchString + "'");
        int index = list.indexOf(searchString);
        if (index != -1) {
            System.out.println("'" + searchString + "' is at index " + index);
        } else {
            System.out.println("'" + searchString + "' is not in the list.");
        }

        // Empty the list
        System.out.println("Emptying the list");
        list.removeAll();
        System.out.println("List after emptying: " + list);
        System.out.println("Size of the list: " + list.size());
    }
}
