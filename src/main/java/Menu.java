import java.util.Scanner;
class Questions {
    static int price;
    // int count1,count2= 0;
    int Audi = 0;
    int fifty = 0;
    int Answer11;
    Scanner sc = new Scanner(System.in);
    Exit ExitObj = new Exit();
    Winner WinnerObj = new Winner(); // creating object of Exit Method
    int Answer1, Answer2, Answer3, Answer4, Answer5, Answer6, Answer7, Answer8, Answer9, Answer10;
    void Question1() 
    {
        System.out.println("1. Which animal is known as the 'Ship of the Desert ?\n"
                + "\n"
                + "\n"
                + "(1)  Lion                            (2)  Tiger\n"
                + "\n"
                + "(3)  Camel                           (4)  parrot\n"
                + "\n"
                + "\n"
                + "\n"
                + "(5) Lifeline\n"
                + "\n");
                Answer1 = sc.nextInt(); // scanner to taking input
            switch (Answer1) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;
            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 10,000/- in your account\n");
                                      price = 10000; Question2();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  Lion --> 12 %\n"
                        +"\n"
                        +"(2) Tiger --> 09 %\n"
                        +"\n"
                        +"(3) Camel --> 77 %\n"
                        +"\n"
                        +"(4) parrot --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 10,000/- in your account\n");
                                                price = 10000;Question2();break;
                        case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("1. Which animal is known as the 'Ship of the Desert ?\n" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  -----                            (2)  Tiger\n"
                                + "\n"
                                + "(3)  Camel                            (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
                                case 2:ExitObj.ExitMethod();break;
                                case 3:System.out.println("Your Answer is Correct\n"
                                                        + "We are upgrading Rupees 10,000/- in your account\n");
                                                        price = 10000;Question2();break;
                                case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  Lion --> 12 %\n"
                        +"(2) Tiger --> 09 %\n"
                        +"\n"
                        +"(3) Camel --> 77 %\n"
                        +"\n"
                        +"(4) parrot --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 10,000/- in your account\n");
                                                price = 10000;Question2();break;
                        case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("1. Which animal is known as the 'Ship of the Desert ?\n" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  -----                            (2)  Tiger\n"
                                + "\n"
                                + "(3)  Camel                            (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
                                case 2:ExitObj.ExitMethod();break;
                                case 3:System.out.println("Your Answer is Correct\n"
                                                        + "We are upgrading Rupees 10,000/- in your account\n");
                                                        price = 10000;Question2();break;
                                case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question1();
                    }
            }
    }
    
    void Question2() {
        System.out.println("2.How many days are there in a week ?"
                + "\n"
                + "\n"
                + "(1)  7                           (2)  5"
                + "\n"
                + "(3)  3                           (4)  11"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline\n"
                + "\n");

        Answer2 = sc.nextInt();

        switch (Answer2) 
        {
            case 1:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 40,000/- in your account");
                        price = 40000;Question3();break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  7 --> 70 %\n"
                        +"(2) 5 --> 09 %\n"
                        +"\n"
                        +"(3) 3 --> 12 %\n"
                        +"\n"
                        +"(4) 11 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 40,000/- in your account\n");
                                                price = 40000;Question3();break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:ExitObj.ExitMethod();break;
                        case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("2.How many days are there in a week ?" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  7                                (2)  -----\n"
                                + "\n"
                                + "(3)  3                                (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 40,000/- in your account\n");
                                                price = 40000;Question3();break;
                                case 2:ExitObj.ExitMethod();break;
                                case 3:ExitObj.ExitMethod();break;
                                case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  7 --> 70 %\n"
                        +"(2) 5 --> 09 %\n"
                        +"\n"
                        +"(3) 3 --> 12 %\n"
                        +"\n"
                        +"(4) 11 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 40,000/- in your account\n");
                                                price = 40000;Question3();break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:ExitObj.ExitMethod();break;
                        case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("2.How many days are there in a week ?" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  7                                (2)  -----\n"
                                + "\n"
                                + "(3)  3                                (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                               case 1:System.out.println("Your Answer is Correct\n"
                                                + "We are upgrading Rupees 40,000/- in your account\n");
                                                price = 40000;Question3();break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:ExitObj.ExitMethod();break;
                        case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question2();
                    }
        }

    }

    void Question3() {
        System.out.println(" 3.How many hours are there in a day ?"
                + "\n"
                + "\n"
                + "(1)  70                           (2)  24"
                + "\n"
                + "(3)  23                           (4)  18"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline ");

        Answer3 = sc.nextInt();

        switch (Answer3) {
            case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;Question4();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  70 --> 70 %\n"
                        +"(2) 24 --> 09 %\n"
                        +"\n"
                        +"(3) 23 --> 12 %\n"
                        +"\n"
                        +"(4) 18 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;Question4();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println(" 3.How many hours are there in a day ?" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  70                               (2)  24\n"
                                + "\n"
                                + "(3)  -----                            (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;Question4();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  70 --> 70 %\n"
                        +"(2) 24 --> 09 %\n"
                        +"\n"
                        +"(3) 23 --> 12 %\n"
                        +"\n"
                        +"(4) 18 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;Question4();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println(" 3.How many hours are there in a day ?" //50-50
                                + "\n"
                                + "\n"
                                + "(1)  70                               (2)  24\n"
                                + "\n"
                                + "(3)  -----                            (4)  -----\n");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;Question4();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    // if(Audi != 0 && fifty != 0)
                    // {
                    //     System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                    //     +"\n");
                    //     Question3();
                    // }
            }
    }

    void Question4() {
        System.out.println("4.How many letters are there in the English alphabet ?"
                + "\n"
                + "\n"
                + "(1)  14                          (2)  56"
                + "\n"
                + "(3)  78                           (4)  26"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");
            Answer4 = sc.nextInt();
            switch (Answer4) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;Question5();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  14 --> 70 %\n"
                        +"(2) 56 --> 09 %\n"
                        +"\n"
                        +"(3) 78 --> 12 %\n"
                        +"\n"
                        +"(4) 26 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;Question5();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("4.How many letters are there in the English alphabet ?"
                                + "\n"
                                + "\n"
                                + "(1)  14                              (2)  -----"
                                + "\n"
                                + "(3)  -----                           (4)  26");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;Question5();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  14 --> 70 %\n"
                        +"(2) 56 --> 09 %\n"
                        +"\n"
                        +"(3) 78 --> 12 %\n"
                        +"\n"
                        +"(4) 26 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                       case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;Question5();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("4.How many letters are there in the English alphabet ?"
                                + "\n"
                                + "\n"
                                + "(1)  14                              (2)  -----"
                                + "\n"
                                + "(3)  -----                           (4)  26");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;Question5();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question4();
                    }
        }

    }

    void Question5() {
        System.out.println("5.Rainbow consist of how many colours?"
                + "\n"
                + "\n"
                + "(1)  10                          (2)  9"
                + "\n"
                + "(3)  7                           (4)  6"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer5 = sc.nextInt();

        switch (Answer5) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;Question6();break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  10 --> 70 %\n"
                        +"(2) 09 --> 09 %\n"
                        +"\n"
                        +"(3) 07 --> 12 %\n"
                        +"\n"
                        +"(4) 06 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;Question6();break;

            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("5.Rainbow consist of how many colours?"
                                + "\n"
                                + "\n"
                                + "(1) -----                         (2)  9"
                                + "\n"
                                + "(3)  7                            (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;Question6();break;

            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  10 --> 70 %\n"
                        +"(2) 09 --> 09 %\n"
                        +"\n"
                        +"(3) 07 --> 12 %\n"
                        +"\n"
                        +"(4) 06 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;Question6();break;

            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("5.Rainbow consist of how many colours?"
                                + "\n"
                                + "\n"
                                + "(1) -----                         (2)  9"
                                + "\n"
                                + "(3)  7                            (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;Question6();break;

            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question5();
                    }

        }

    }

    void Question6() {
        System.out.println("6.How many days are there in a year?"
                + "\n"
                + "\n"
                + "(1)  365                           (2)  865"
                + "\n"
                + "(3)  436                           (4)  689"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer6 = sc.nextInt();

        switch (Answer6) {
            case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;Question7();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  365 --> 70 %\n"
                        +"(2) 865 --> 09 %\n"
                        +"\n"
                        +"(3) 436 --> 12 %\n"
                        +"\n"
                        +"(4) 689 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;Question7();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("6.How many days are there in a year?"
                                + "\n"
                                + "\n"
                                + "(1)  365                            (2) -----"
                                + "\n"
                                + "(3) -----                           (4)  689");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;Question7();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  365 --> 70 %\n"
                        +"(2) 865 --> 09 %\n"
                        +"\n"
                        +"(3) 436 --> 12 %\n"
                        +"\n"
                        +"(4) 689 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;Question7();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("6.How many days are there in a year?"
                                + "\n"
                                + "\n"
                                + "(1)  365                            (2) -----"
                                + "\n"
                                + "(3) -----                           (4)  689");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;Question7();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question6();
                    }
        }

    }

    void Question7() {
        System.out.println("7.How many minutes are there in an hour?\n"
                + "\n"
                + "\n"
                + "(1)  80                          (2)  90"
                + "\n"
                + "(3)  60                          (4)  600"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer7 = sc.nextInt();

        switch (Answer7) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;Question8();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  80 --> 70 %\n"
                        +"(2) 90 --> 09 %\n"
                        +"\n"
                        +"(3) 60 --> 12 %\n"
                        +"\n"
                        +"(4) 600 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                       case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;Question8();break;
            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("7.How many minutes are there in an hour?\n"
                                + "\n"
                                + "\n"
                                + "(1)  -----                          (2)  90"
                                + "\n"
                                + "(3)  60                          (4)  600");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;Question8();break;
            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  80 --> 70 %\n"
                        +"(2) 90 --> 09 %\n"
                        +"\n"
                        +"(3) 60 --> 12 %\n"
                        +"\n"
                        +"(4) 600 --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;Question8();break;
            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("7.How many minutes are there in an hour?\n"
                                + "\n"
                                + "\n"
                                + "(1)  -----                          (2)  90"
                                + "\n"
                                + "(3)  60                          (4)  600");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                               case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;Question8();break;
            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question7();
                    }
        }

    }

    void Question8() {
        System.out.println("8.How many seconds are there in a minute?"
                + "\n"
                + "\n"
                + "(1)  80  seconds                         (2)  90 seconds"
                + "\n"
                + "(3) 60 seconds                           (4)  600 seconds"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer8 = sc.nextInt();

        switch (Answer8) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;Question9();break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  80 sec --> 70 %\n"
                        +"(2) 90 sec --> 09 %\n"
                        +"\n"
                        +"(3) 60 sec --> 12 %\n"
                        +"\n"
                        +"(4) 600 sec --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                         case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;Question9();break;

            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("8.How many seconds are there in a minute?"
                + "\n"
                + "\n"
                + "(1)  -----                               (2)  90 seconds"
                + "\n"
                + "(3) 60 seconds                           (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                 case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;Question9();break;

            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  80 sec --> 70 %\n"
                        +"(2) 90 sec --> 09 %\n"
                        +"\n"
                        +"(3) 60 sec --> 12 %\n"
                        +"\n"
                        +"(4) 600 sec --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                         case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;Question9();break;

            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("8.How many seconds are there in a minute?"
                            + "\n"
                            + "\n"
                            + "(1)  -----                               (2)  90 seconds"
                            + "\n"
                            + "(3) 60 seconds                           (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                 case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;Question9();break;

            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question8();
                    }
        }

    }

    void Question9() {
        System.out.println("9.How many seconds make one hour?"
                + "\n"
                + "\n"
                + "(1)  800  seconds                         (2)  3600 seconds"
                + "\n"
                + "(3)  900 seconds                          (4)  6000 seconds"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer9 = sc.nextInt();

        switch (Answer9) {
            case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;Question10();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  800 sec --> 70 %\n"
                        +"(2) 3600 sec --> 09 %\n"
                        +"\n"
                        +"(3) 900 sec --> 12 %\n"
                        +"\n"
                        +"(4) 6000 sec --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;Question10();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("9.How many seconds make one hour?"
                + "\n"
                + "\n"
                + "(1)  800  seconds                         (2)  3600 seconds"
                + "\n"
                + "(3)  -----                                (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;Question10();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  800 sec --> 70 %\n"
                        +"(2) 3600 sec --> 09 %\n"
                        +"\n"
                        +"(3) 900 sec --> 12 %\n"
                        +"\n"
                        +"(4) 6000 sec --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                       case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;Question10();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("9.How many seconds make one hour?"
                            + "\n"
                            + "\n"
                            + "(1)  800  seconds                         (2)  3600 seconds"
                            + "\n"
                            + "(3)  -----                                (4)  -----");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                               case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;Question10();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question9();
                    }
        }

    }

    void Question10() {
        System.out.println("10.Baby frog is known as......."
                + "\n"
                + "\n"
                + "(1)  Tadpole                         (2)  Tiger"
                + "\n"
                + "(3)  Puppy                           (4) Leopard"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Lifeline");

        Answer10 = sc.nextInt();
        switch (Answer10) //last question
        {
            case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();System.exit(0);
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if(Audi == 0 && fifty == 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"
                       +"(2) 50-50"); 

                    Answer11 = sc.nextInt();

                    switch (Answer11)
                    {
                        case 1:
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  Tadpole --> 70 %\n"
                        +"(2) Tiger --> 09 %\n"
                        +"\n"
                        +"(3) Puppy --> 12 %\n"
                        +"\n"
                        +"(4) Leopard --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                        case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();System.exit(0);
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                        }break;
                    
                        case 2:fifty++;
                        System.out.println("10.Baby frog is known as......."
                            + "\n"
                            + "\n"
                            + "(1)  Tadpole                         (2) -----"
                            + "\n"
                            + "(3)  -----                           (4) Leopard");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();System.exit(0);
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                                }break;
                    }

                    }
                    if(Audi == 0 && fifty != 0)
                    {
                       System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) Audience poll\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        Audi++;  //if Audi==1 write else
                        System.out.println("(1)  Tadpole --> 70 %\n"
                        +"(2) Tiger --> 09 %\n"
                        +"\n"
                        +"(3) Puppy --> 12 %\n"
                        +"\n"
                        +"(4) Leopard --> 2 %\n");

                        Answer11 = sc.nextInt();

                        switch (Answer11) 
                        {
                       case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();System.exit(0);
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                        }
                       }
                    }
                    if(Audi != 0 && fifty == 0)
                    {
                         System.out.println("Available Life-Lines :\n"
                       +"\n"
                       +"(1) 50-50\n"
                       +"\n"); 

                       Answer11 = sc.nextInt();

                       if(Answer11==1)
                       {
                        fifty++;
                       System.out.println("10.Baby frog is known as......."
                            + "\n"
                            + "\n"
                            + "(1)  Tadpole                         (2) -----"
                            + "\n"
                            + "(3)  -----                           (4) Leopard");
                                Answer11 = sc.nextInt();

                                switch (Answer11) 
                                {
                                case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();System.exit(0);
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
                                }
                        }
                    }
                    if(Audi != 0 && fifty != 0)
                    {
                        System.out.println(" Sorry ! There is NO Life-Lines Avaliable\n"
                        +"\n");
                        Question10();
                    }
        }
    }

}

class Menu {
    static String username;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("<-----Enter Your Name----->\n");
        username = sc.nextLine();
        System.out.println("<-----Welcome to koon banega crorepati----->\n"
        );
        Questions QuestionsObj = new Questions();
        QuestionsObj.Question1();
        QuestionsObj.Question2();QuestionsObj.Question3();QuestionsObj.Question4();QuestionsObj.Question5();QuestionsObj.Question6();QuestionsObj.Question7();QuestionsObj.Question8();QuestionsObj.Question9();QuestionsObj.Question10();

    }
}

class Winner {
    void WinnerMethod() 
    {   System.out.println("-------------->!!! Winner !!! Winner !!"+ Menu.username+"!! Winner !!! Winner !!!<--------------\n"
        +"\n"
        +"\n"
        +" You won "+Questions.price+"\n"
        +"\n"
        +"\n"
        +"--------------  You won 20 Crore  --------------"
        +"\n"
        +"\n");

    }
}
class Exit {
    void ExitMethod() 
    {
        System.out.println("Oops !!! Your ans is wrong <<--------------------\n"
        +"\n"
        +"\n"
        +"Username :"+Menu.username+" You won "+Questions.price+" only\n"
        +"\n"
        +"\n"
        + "Thanks for play,have a nice day :)\n"
        +"\n");
        System.exit(0);
    }
}
