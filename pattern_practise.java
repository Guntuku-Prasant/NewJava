public class pattern_practise {
    public static void main(String[] args) {
        for (int i =1; i<=5 ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = 1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k =4 ; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();

        }

        //pyramid
        for (int i=1;i<=5;i++){
            for(int j=4; j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        //pyramid 2
        for(int i=1; i<=10; i++){
            for(int j=9;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int k=2;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //rev pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k =9;k>(i*2);k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
