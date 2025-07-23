 int rows = 5;
            int num = 1;

            for (int i = 1; i <= rows; i++) {
                if (i % 2 != 0) {
                    for (int j = 1; j <= rows; j++) {
                        System.out.printf("%2d ",num);
                        num++;
                    }
                } else {
                    int temp = num + rows - 1;
                    for (int j = 1; j <= rows; j++) {
                        System.out.printf("%2d ",temp);
                        temp--;
                        num++;
                    }
                }
                System.out.println();
            }
        }
    }
