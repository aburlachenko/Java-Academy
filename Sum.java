public class Sum {
    public static int sum = 0;

    public static void main(String args[]) {
        for (String str: args) {
            str.replace("\""," ").replace(" ", "");
            String[] parts = str.split(" ");
            for (String str_part: parts) {
                if (!str_part.equals("")) {
                    sum = sum + Integer.parseInt(str_part);
                }
            }
        }
        System.out.println(sum);
    }
}