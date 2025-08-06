int num = 1;
        int lineEnd = 1;
        int next=2;
        for (int i = 1; i <= 15; i++) {
            System.out.print(num + " ");
            num++;
            if (i == lineEnd) {
                System.out.println();
                lineEnd +=next;
                next++;
            }
        }
