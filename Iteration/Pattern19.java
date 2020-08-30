public class Pattern19 {

    public static void main(String[] args) {
        int rows = 5, c = 1;

        for(int i = 0; i < rows; i++) {
            

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;

                System.out.printf(" %d", c);
            }

            System.out.println();
        }
    	
    }
}