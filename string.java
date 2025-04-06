import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        int a =10;
        float b =3.456f;
        System.out.printf("The value of a is %d and the value of b is: %f\n", a,b);
        System.out.printf("The value of a is %d and the value of b is: %8.3f\n", a ,b);

        String name ="Guntuku";
        System.out.println(name);
        System.out.println(name.substring(2,5)) ;
        System.out.println(name.trim());
        System.out.println(name.replace('G','P'));
        System.out.println(name.replace("Guntuku" ,"Happy"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("n"));
        System.out.println(name.indexOf("u"));
        System.out.println(name.lastIndexOf("u",4));
        System.out.println(name.equals("Guntuku"));
        System.out.println(name.equalsIgnoreCase("GuNtuKu"));

    }
}