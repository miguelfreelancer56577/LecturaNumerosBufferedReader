# LecturaNumerosBufferedReader

The Main.java file contain de main method

uses

LecturaNumeros ls = new LecturaNumeros();
        int num;
        Double num3;
        
        String msgInt = "Ingrese un numero entero (int)"
                , msgInteger = "Ingrese un numero entero (Integer)"
                , msgDouble = "Ingrese un numero decimal (double)";
        
//        asks an int per message 
        System.out.println(msgInt);
        num = ls.readInt();
        System.out.println(num);
//        asks an Integer per message 
        System.out.println(msgInteger);
        num = ls.readInteger();
        System.out.println(num);
//        asks an Double per message 
        System.out.println(msgDouble);
        num3 = ls.readDouble();
        System.out.println(num3);
        
//        asks an int per message of the function
        num = ls.readInt(msgInt);
        System.out.println(num);
//        asks an Integer per message  of the function
        num = ls.readInteger(msgInteger);
        System.out.println(num);
//        asks an Double per message  of the function
        num3 = ls.readDouble(msgDouble);
        System.out.println(num3);
