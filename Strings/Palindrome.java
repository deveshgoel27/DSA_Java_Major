public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";


        String normalized = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String revstr = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            revstr += normalized.charAt(i);
        }
        if (normalized.equals(revstr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }   
    }  
}

