public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Anas";
        char target = 'w';
        System.out.println(search(name, target));
    }

    private static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
    return false;
    }
}
