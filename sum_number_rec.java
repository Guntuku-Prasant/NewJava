public class sum_number_rec {
    static int recSum(int i){
        if(i==1){
            return i;
        }
        else{
            return i + recSum(i-1);
        }

    }

    public static void main(String[] args) {
        int c= recSum(3);
        System.out.println(c);

    }
}