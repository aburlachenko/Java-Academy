public class Sum {

    public static void main(String args[]) {
		int sum = 0;
        for (String arg: args) {
            String[] parts = arg.split("[\\s\"]");
            for (String part: parts) {
                if (!part.equals("")) {
                    sum += Integer.parseInt(part);
                }
            }
        }
        System.out.println(sum);
    }

}