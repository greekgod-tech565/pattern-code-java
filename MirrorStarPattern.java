public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <=5 ; i++) {
            if(i==1){
                for (int j = 1; j <=10 ; j++) {
                    System.out.print("*"+" ");
                }
                //System.out.println();
            }else {
                for (int j = 1; j <=rows-i+1 ; j++) {
                    System.out.print("*"+" ");
                }
                for (int s = 1; s<(2*i)-1 ; s++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <=rows-i+1 ; j++) {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        int col=5;
        for (int i = 1; i <=col ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            for (int s = 1; s<=10-(2*i) ; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

