public class fibo_recursion {
    static int fibbo(int n){
        int sum=0;

            if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }
            else{
                return fibbo(n-1)+ fibbo(n-2);
            }
    }
    public static void main(String[] args) {
        int c= fibbo(4);
        System.out.println(c);
    }
}