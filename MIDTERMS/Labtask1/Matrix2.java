public static void main(String[] args) {
    //for user input
    Scanner input = new Scanner(System.in);
    //for try again prompt
    char choice;
    do {
        //declare a 2D array with 3 rows and 3 columns
        int[][] matrix = new int[3][3];
        System.out.println("Input 9 elements:");
        //accept the 9 numbers from the user
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextInt();
            }
        }

        System.out.println("\nDisplay Here are the Numbers and the required outputs:\n");
        System.out.println("=========================================================");

        //for displaying the user input and row sum, and calculating row sums
        System.out.println("\n\t\t\t\t\t\tRow Sum:");
        for (int r = 0; r < 3; r++) {
            int rowSum = 0;
            System.out.print("\t\t  ");
            for (int c = 0; c < 3; c++) {
                System.out.printf("%-10d", matrix[r][c]);
                rowSum += matrix[r][c];
            }
            System.out.printf("%-10d%n", rowSum);
        }
        //for displaying and calculating column sums
        System.out.println();
        System.out.print("Column Sum:");
        System.out.print("\t  ");

        for (int c = 0; c < 3; c++) {
            int columnSum = 0;
            for (int r = 0; r < 3; r++) {
                columnSum += matrix[r][c];
            }
            System.out.printf("%-10d", columnSum);
        }
        //for displaying and calculating diagonal sums
        int dia1 = 0, dia2 = 0;
        System.out.println();
        for(int  d=0; d < matrix.length; d++ )
        {
            dia1 += matrix[d][d];
            dia2 += matrix[d][matrix.length - 1 - d];
        }
        System.out.println("\nDiagonal sum 1: " + dia1);
        System.out.println("Diagonal sum 2: " + dia2);
        
        System.out.println();
        System.out.println("========================================================");
        
        System.out.print("\n\nTry Again [y/n]: ");
        choice = input.next().charAt(0);
    } 
    while (choice == 'y');
    input.close();
}
