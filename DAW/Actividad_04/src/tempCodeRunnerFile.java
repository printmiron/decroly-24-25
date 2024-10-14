
        for (int i = 0; i < numP; i++) {
            if (numP <= numQ) {
                numero[i] = numP + i;
            }else{
                numero[i] = numP - i;
            }
        }

        for (int i = 0; i < numP; i++) {
            System.err.println("Numero[" + i +"]" + numero[i]);
        }