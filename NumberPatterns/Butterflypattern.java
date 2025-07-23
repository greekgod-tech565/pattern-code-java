int rows = 5;
        int space = 8; int upper=2;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            space-=2;
            System.out.println();
        }
        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <=upper ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print("*"+" ");
            }
            upper+=2;
            System.out.println();
        }
