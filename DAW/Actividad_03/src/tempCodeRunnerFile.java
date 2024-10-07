        int opcion;

        do { 
            
            System.out.println("Menu opciones: ");
            System.out.println("1. Suma");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleciona una opcion!");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.println("Introduce primer numero: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + ( num1 + num2));
                    break;

                case 2:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + ( num1 - num2));
                    break;

                case 3:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado es: " + ( num1 * num2));
                    break;

                case 4:

                    System.out.println("Introduce primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Introduce segundo numero: ");
                    num2 = sc.nextDouble();

                    if (num2 == 0){
                        System.out.println("No es posible");
                    }else{
                        System.out.println("Resultado es: " + ( num1 / num2));
                    }

                case 5:

                    System.out.println("Salir de programa");
                    break;

                default:
                    System.out.println("Opcion no valida!");
                    throw new AssertionError();
            }

        } while (opcion != 5);