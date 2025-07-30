 int rows = 5;
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.print("*"+"");
                for (int j = 1; j < rows; j++) {
                    System.out.print("  ");
                }
                System.out.print("*" + " ");
            } else if (i == 5) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*" + " ");
            } else {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*" + " ");
                for (int j = 1; j < rows - (i * 1); j++) {
                    System.out.print("  ");
                }
                System.out.print("*" + " ");
            }

            System.out.println();
        }
        for (int i = 1; i<rows ; i++) {
            for (int j = 1; j <=rows-(i+1) ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j<=rows-(rows-i) ; j++) {
                System.out.print("  ");
            }
            System.out.println("*" + " ");
        }
        System.out.println();
        }
    }
