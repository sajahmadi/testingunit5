public class DataStructuresandAlgorithms {
    public static int recursive_search(String sought, String[] arr, int index) {
        if (index == arr.length) {
            return -1; // The item wasn't found
        }

        if (arr[index].equals(sought)) {
            return index; // The item was found
        }
        return recursive_search(sought, arr, index + 1);
    }
}
