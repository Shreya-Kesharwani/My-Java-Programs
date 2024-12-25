package String;

public class sort {
    public static void main(String[] args) {
        String s = "pwskill";
        StringBuilder sortedStringBuilder = new StringBuilder(s);
        for (int i = 0; i < sortedStringBuilder.length() - 1; i++) {
            for (int j = i + 1; j < sortedStringBuilder.length(); j++) {
                if (sortedStringBuilder.charAt(i) > sortedStringBuilder.charAt(j)) {
                    // Swap characters if they are out of order
                    char temp = sortedStringBuilder.charAt(i);
                    sortedStringBuilder.setCharAt(i, sortedStringBuilder.charAt(j));
                    sortedStringBuilder.setCharAt(j, temp);
                }
            }
        }
        String sortedString = sortedStringBuilder.toString();
    System.out.println("Original: " + s);
    System.out.println("Alphabetically Sorted: " + sortedString);
    }
}
