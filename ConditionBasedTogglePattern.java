        int rows =5;
        for (int i = 1; i <=rows ; i++) {
            int start = 0; int end =1 ;
            for (int j = 1; j <=i ; j++) {
               if((i%2!=0)&&(j%2!=0)||(i%2==0)&&(j%2==0)){
                   System.out.print(end+" ");
               }
               else {
                   System.out.print(start + " ");

               }
                
            }
            System.out.println();
        }
    }
