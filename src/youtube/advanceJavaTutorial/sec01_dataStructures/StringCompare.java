package youtube.advanceJavaTutorial.sec01_dataStructures;

public class StringCompare {
    public static void main(String[] args) {
        //String s1 = new String("Simplilearn");
        //String s2 = new String("Pratice");
        //String s3 = new String("Study");
        //String s4 = new String("Study");

        //System.out.println("Comparing "+s1+" and" + s2 + " :"+s1.equals(s2));
        //System.out.println("Comparing "+s3+" and" + s4 + " :"+s3.equals(s2));
        //System.out.println("Comparing "+s1+" and" + s4 + " :"+s1.equals(s4));

        String input = "Simplilearn";

        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1 = input1.reverse();

        System.out.println("The reverse string is: "+input1);
    }
}
