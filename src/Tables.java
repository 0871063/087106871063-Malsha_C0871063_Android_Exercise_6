public class Tables {
    public static void main(String[] args) {
        System.out.println("Tables of multiplication");

        for(int i = 2; i <= 10; i++){
            System.out.printf("Table of %d : \n", i);
            for(int j = 1; j <= 10; j++) {
                int outPut = j * i ;
                System.out.printf("%d * %d = %d \n", j , i, outPut);
            }
        }
    }
}
