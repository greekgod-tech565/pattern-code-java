int rows =5; int num =1;
        for (int i = 1; i<=rows ; i++) {
            if(i==1||i==rows){
                for (int j = 1; j <=rows ; j++) {
                    System.out.print(num+" ");
                    num++;
                }
            }
            else {
                for (int j = 1; j<=rows-i ; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j<=i ; j++) {
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
