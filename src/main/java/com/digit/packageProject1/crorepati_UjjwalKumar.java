package com.digit.packageProject1;
import java.util.Scanner;
class Questions {
    static int price;
    int count1,count2= 0;
    Scanner sc = new Scanner(System.in);
    Exit ExitObj = new Exit();
    Winner WinnerObj = new Winner(); // creating object of Exit Method
    int Answer1, Answer2, Answer3, Answer4, Answer5, Answer6, Answer7, Answer8, Answer9, Answer10;
    void Question1() {
        System.out.println("1. Which animal is known as the 'Ship of the Desert ?\n"
                + "\n"
                + "\n"
                + "(1)  Lion                            (2)  Tiger\n"
                + "\n"
                + "(3)  Camel                           (4)  parrot\n"
                + "\n"
                + "\n"
                + "Help :- LifeLines\n"
                + "\n"
                + "\n"
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");
                Answer1 = sc.nextInt(); // scanner to taking input
            switch (Answer1) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;
            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 10,000/- in your account\n");
                                      price = 10000;break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 3 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question1();} else {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question1();} break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;
                    System.out.println("1. Which animal is known as the 'Ship of the Desert ?\n"
                            + "\n"
                            + "\n"
                            + "(1)  ------                          (2)  Tiger\n"
                            + "\n"
                            + "(3)  Camel                           (4)  ------\n"
                            + "\n"
                            + "(5) Audience poll (u will get right ans--->)");
                    Answer1 = sc.nextInt();

                    switch (Answer1) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod(); break;
                        case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 10,000/- in your account");
                                    price = 10000;break;
                        case 4:ExitObj.ExitMethod();break;
                        case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 3 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question1();
                        }
                         else 
                        {
                            System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question1();
                            }
                         }
                        } 
                        else 
                        {
                    System.out.println(" Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer2 = sc.nextInt();

        switch (Answer2) {
            case 1:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 40,000/- in your account");
                        price = 40000;break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 1 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question2();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question2();
                }break;
            case 6: if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("2.How many days are there in a week ?"
                            + "\n"
                            + "\n"
                            + "(1)  7                           (2)  5"
                            + "\n"
                            + "(3) ----                         (4)  ----"
                            + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer2 = sc.nextInt();

                    switch (Answer2) {
                        case 1: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 40,000/- in your account");
                                    price = 40000;break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:ExitObj.ExitMethod();break;

                        case 4:ExitObj.ExitMethod();break;
                         case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 1 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question2();
                        }
                         else 
                        {
                            System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question2();
                            }
                        
                    }
                } else {
                    System.out.println("Opps!!! ,You have already used your 50-50<<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer3 = sc.nextInt();

        switch (Answer3) {
            case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 1,60,000/- in your account");
                        price = 160000;break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
            case 5: // poll
                if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 2 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question3();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question3();
                }break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println(" 3.How many hours are there in a day ?"
                            + "\n"
                            + "\n"
                            + "(1)  -----                           (2)  24"
                            + "\n"
                            + "(3)  -----                           (4)  18"
                            + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer3 = sc.nextInt();

                    switch (Answer3) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1,60,000/- in your account");
                                    price = 160000;break;

                        case 3:ExitObj.ExitMethod();break;

                        case 4:ExitObj.ExitMethod();break;
                         case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 2 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question3();
                        }
                         else 
                        {
                            System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question3();
                            }
                    }
                } else {System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
                    Question3();
                }
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");
            Answer4 = sc.nextInt();
            switch (Answer4) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:System.out.println("Your Answer is Correct\n"
                        + "We are upgrading Rupees 6,40,000/- in your account");
                        price = 640000;break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 4 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question4();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question4();
                }break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("4.How many letters are there in the English alphabet ?"
                                        + "\n"
                                        + "\n"
                                        + "(1)  14                          (2)  ------"
                                        + "\n"
                                        + "(3)  ------                      (4)  26"
                                        + "\n"
                                        + "(5) Audience poll (u will get right ans--->)");

                    Answer4 = sc.nextInt();

                    switch (Answer4) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:ExitObj.ExitMethod();break;

                        case 4:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 6,40,000 /- in your account");
                                     price = 640000;break;
                         case 5:if (count1 == 0) 
                        {   System.out.println("----------------------> Ans is option 4 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question4();
                        }
                         else{
                            System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question4(); }
                    }
                } else {
                    System.out.println(" Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer5 = sc.nextInt();

        switch (Answer5) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are updrading Rupees 25 Lakh/- in your account");
                                     price = 2500000;break;

            case 4:ExitObj.ExitMethod();break;
            case 5: // poll
                if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 3 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question5();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question5();
                } break;
            case 6: // 50-50
                if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("4.Rainbow consist of how many colours?"
                                    + "\n"
                                    + "\n"
                                    + "(1) ------                       (2)  9"
                                    + "\n"
                                    + "(3)  7                           (4)  ------"
                                    + "\n"
                                    + "(5) Audience poll (u will get right ans--->)");

                    Answer5 = sc.nextInt();

                    switch (Answer5) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 25 Lakh/- in your account");
                                    price = 2500000;break;
                        case 4:ExitObj.ExitMethod();break;
                        case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 3 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question5();
                        }
                         else 
                        {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question5();
                        }
                    }
                } else {
                    System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer6 = sc.nextInt();

        switch (Answer6) {
            case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;break;
            case 2:ExitObj.ExitMethod();break;

            case 3:ExitObj.ExitMethod();break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 1 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question6();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question6();
                }break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("6.How many days are there in a year?"
                                    + "\n"
                                    + "\n"
                                    + "(1)  365                           (2)  -----"
                                    + "\n"
                                    + "(3)  -----                           (4)  689"
                                    + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer6 = sc.nextInt();

                    switch (Answer6) {
                        case 1:System.out.println("Your Answer is Correct\n"
                                         + "We are upgrading Rupees 50 Lakh/- in your account");
                                         price = 5000000;break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:ExitObj.ExitMethod();break;

                        case 4:ExitObj.ExitMethod();break;
                         case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 1 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question6();
                        }
                         else 
                        {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question6();
                        }
                    }
                } else 
                {
                    System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer7 = sc.nextInt();

        switch (Answer7) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000;break;
            case 4:ExitObj.ExitMethod();break;
            case 5: // poll
                if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 3 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question7();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question7();}
                    break;
            case 6: // 50-50
                if (count2 == 0) { System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("7.How many minutes are there in an hour?\n"
                                    + "\n"
                                    + "\n"
                                    + "(1)  80                          (2) -----"
                                    + "\n"
                                    + "(3)  60                          (4) -----"
                                    + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer7 = sc.nextInt();

                    switch (Answer7) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 1 crore/- in your account");
                                    price = 1000000; break;

                        case 4:ExitObj.ExitMethod();break;
                         case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 3 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question7();
                        }
                         else 
                        {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question7();
                            }
                    }
                } else {
                    System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer8 = sc.nextInt();

        switch (Answer8) {
            case 1:ExitObj.ExitMethod();break;
            case 2:ExitObj.ExitMethod();break;

            case 3:System.out.println("Your Answer is Correct\n"
                      +"We are upgrading Rupees 7 crore/- in your account");
                      price = 7000000;break;

            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 3 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question8();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question8();
                }
                // Audience poll
                break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("8.How many seconds are there in a minute?"
                                + "\n"
                                + "\n"
                                + "(1) -----                         (2)  90 seconds"
                                + "\n"
                                + "(3) 60 seconds                    (4) -----"+ "\n"
                            + "(5) Audience poll (u will get right ans--->)");
                    Answer8 = sc.nextInt();
                    switch (Answer8) {
                        case 1:ExitObj.ExitMethod();break;
                        case 2:ExitObj.ExitMethod();break;

                        case 3:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 7 crore/- in your account");
                                    price = 7000000;break;

                        case 4:ExitObj.ExitMethod();break;
                        case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 3 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question8();
                        }
                         else 
                        {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question8();
                        }
                    }
                } else {
                    System.out.println(" Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer9 = sc.nextInt();

        switch (Answer9) {
            case 1:ExitObj.ExitMethod();break;
            case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 2 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question9();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question9();
                }break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("9.How many seconds make one hour?"
                        + "\n"
                        + "\n"
                        + "(1) -----                                 (2)  3600 seconds"
                        + "\n"
                        + "(3)  900 seconds                          (4)  -----"
                        + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer9 = sc.nextInt();

                    switch (Answer9) {
                        case 1: ExitObj.ExitMethod();break;
                        case 2:System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 14 crore/- in your account");
                                    price = 14000000;break;
                        case 3:ExitObj.ExitMethod();break;
                        case 4:ExitObj.ExitMethod();break;
                        case 5:if (count1 == 0) 
                        {
                            System.out.println("----------------------> Ans is option 2 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question9();
                        }
                         else 
                        {System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question9();
                            }
                    }
                } else {System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
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
                + "(5) Audience poll (u will get right ans--->)\n"
                + "\n"
                + "(6) 50-50");

        Answer10 = sc.nextInt();
        switch (Answer10) //last question
        {
            case 1:System.out.println("Your Answer is Correct\n"
                                   + "We are upgrading Rupees 20 crore/- in your account");
                                   price = 20000000;
                                   WinnerObj.WinnerMethod();
                break;
            case 2:ExitObj.ExitMethod();break;
            case 3:ExitObj.ExitMethod();break;
            case 4:ExitObj.ExitMethod();break;
            case 5:if (count1 == 0) {
                    System.out.println("----------------------> Ans is option 3 <--------------------");
                    count1++;
                    System.out.println(count1);
                    Question10();
                } else {
                    System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                    Question10();
                }break;
            case 6:if (count2 == 0) {
                    System.out.println("you have choosen 50-50\n"
                            + "\n"
                            + "So we removed 2 wrong options ");
                    count2++;

                    System.out.println("10.Baby frog is known as......."
                                    + "\n"
                                    + "\n"
                                    + "(1)  Tadpole                         (2) ------"
                                    + "\n"
                                    + "(3)  Puppy                           (4) ------"
                                    + "\n"
                            + "(5) Audience poll (u will get right ans--->)");

                    Answer10 = sc.nextInt();

                    switch (Answer10) {
                        case 1: System.out.println("Your Answer is Correct\n"
                                    + "We are upgrading Rupees 20 crore/- in your account");
                                    price = 20000000;
                                    WinnerObj.WinnerMethod(); break;
                        case 2:ExitObj.ExitMethod();break;
                        case 3:ExitObj.ExitMethod();break;
                        case 4:ExitObj.ExitMethod();break;
                        case 5:if (count1 == 0) {
                            System.out.println("----------------------> Ans is option 1 <--------------------");
                            count1++;
                            System.out.println(count1);
                            Question10();}
                        else{System.out.println(" Opps!!! ,You have already used your Audience Poll <<--------------------");
                            Question10();}
                    }
                } else {
                    System.out.println("Opps!!! ,You have already used your 50-50 <<--------------------");
                    Question10();
                }
           }
    }

}

class crorepati_UjjwalKumar {
    static String username;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("<-----Enter Your Name----->\n");
        username = sc.nextLine();
        System.out.println("<-----Welcome to koon banega crorepati----->\n"
        );Questions QuestionsObj = new Questions();
        QuestionsObj.Question1();QuestionsObj.Question2();QuestionsObj.Question3();QuestionsObj.Question4();QuestionsObj.Question5();QuestionsObj.Question6();QuestionsObj.Question7();QuestionsObj.Question8();QuestionsObj.Question9();QuestionsObj.Question10();

    }
}

class Winner {
    void WinnerMethod() 
    {   System.out.println("-------------->!!! Winner !!! Winner !!"+ Main.username+"!! Winner !!! Winner !!!<--------------\n"
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
        +"Username :"+crorepati_UjjwalKumar.username+" You won "+Questions.price+" only\n"
        +"\n"
        +"\n"
        + "Thanks for play,have a nice day :)\n"
        +"\n");
        System.exit(0);
    }
}

