 int matriz [][] = new int [10][10];

        int num = 1;

        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               matriz[i][j] = num * ( j + 1 );
               num++;
           } 
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }