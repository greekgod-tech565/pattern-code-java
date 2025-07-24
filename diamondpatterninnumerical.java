 int rows = 3; int row2=2;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j + " ");
            }
            for (int j = (i * 2) - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
            for (int inner = 1; inner < rows; inner++) {
                for (int j = 1; j <row2+(inner-1); j++) {
                    System.out.print("  ");
                }
                for (int j = rows - (inner * 1); j < (rows * row2 )- (inner*2) ; j++) {
                    System.out.print(j + " ");
                }
                for (int j = rows-inner; j>=row2; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
