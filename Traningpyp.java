import java.util.Arrays;
import java.util.Scanner;

public class Traningpyp {

    static  Scanner read = new Scanner(System.in);
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // هذا البرنامج يحسب عمرك ويحسب راتبك مخصوم منه 10%
        System.out.println(" please inter your first name");

        String name = input.next();

        System.out.println(" please inter your salary ");
        float salary = input.nextFloat();

        float net_salary = salary - (salary * 0.10f);

        System.out.println("your name is " + name + " and your salary is " + net_salary);

        ////////////////////////////////////////////////

        /////الة حاسبة بسيطه تقوم بكل العمليات الجمع والطرح والضرب والقسمة وايضا باقي القسمه  وطباعتها
        System.out.println("please enter first number:");
        int num1=input.nextInt();
        System.out.println("please enter second number:");
        int num2=input.nextInt();
        int summation_result=num1+num2;
        int subtraction_result=num1-num2;
        int multiplication_result=num1*num2;
        int division_result=num1/num2;
        int remainder_result=num1%num2;
        System.out.println("the summation result is :" + summation_result);
        System.out.println("the subtraction result is :"+subtraction_result);
        System.out.println("the multiplication result is :"+multiplication_result);
        System.out.println("the division result is :"+division_result);
        System.out.println("the remainder is :"+remainder_result);

        //هذا البرنامج يطلب منك اسمك وعمرك ثم يطبعهم

        System.out.println("enter your name");
        String name1 = input.next();

        System.out.println("enter your age");

        byte age = input.nextByte();

        System.out.println("your name is " + name1 + " and your age is " + age);


        /////////////////////////////////////////

        ////برنامج يقوم بطلب اسمك الاول والاخير ويقوم بطباعته

        System.out.println("enter first name: ");
        String firstname=input.next();
        System.out.println("enter last name: ");
        String lastname=input.next();
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);


        //////////////////////////////////////////


        /////برنامج يحسب مساحة مستطيل ومحيطه

        System.out.println("please enter the length of rectangle:");
        int length=input.nextInt();
        System.out.println("please enter the width of rectangle:");
        int width55=input.nextInt();
        int area11=length*width55;
        System.out.println("the rectangle area is "+area11);
        int perimeter11=(length+width55)*2;
        System.out.println("the rectangle perimeter is "+perimeter11);


        ///////////////////////////////////////////ظ
        // هذا البرنامج سيطلب منك اسمك والمكان الذي تعمل فيه

        System.out.println("enter your name ");

        String name2 = input.next();

        System.out.println("enter your name company");

        String company = input.next();

        System.out.println(" your name is " + name2 + " and you are work at" + company);


        ///////////////////////////

        ////برنامج يحسب مساحة محيط مربع ومساحته

        System.out.println("please enter the side length");
        int sideLength=input.nextInt();
        int area=sideLength*sideLength;
        System.out.println("the square area is "+area);
        int perimeter=sideLength*2;
        System.out.println("the square perimeter is "+perimeter);


        //////////////////////////////

        ////برنامج يحسب لك مساحة الدائره

        final double PI = 3.14159;
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area2 = radius * radius * PI;
        System.out.println("The area for the circle of radius " +
                radius + " is " + Math.round(area2));


        ///////////////////////////
        // برنامج يحمع عددين

        System.out.println(" enter the first number");
        int first = input.nextInt();

        System.out.println("enter the second number");

        int second = input.nextInt();

        System.out.println(" your result is " + first + second);


        ///////////////////////////

        // برنامج يضرب لك عددين

        System.out.println(" enter the first number");
        int three = input.nextInt();

        System.out.println("enter the second number");

        int four = input.nextInt();

        System.out.println(" your result is " + three * four);


        ///////////////////////////

        // برنامج يقسم لك عددين

        System.out.println(" enter the first number");
        int ni = input.nextInt();

        System.out.println("enter the second number");

        int ns = input.nextInt();

        System.out.println(" your result is " + ni / ns);


        ///////////////////////////

        //// امثلة لى الاولويات في العمليات الحسابيه

        int n1=5;
        int n2=4;
        int n3=7;
        int n4=12;
        int result=n1+n2+n3+n4;
        System.out.println("n1+n2+n3+n4 = "+result);
        result=n1+n2*n3-n4;
        System.out.println("n1+n2*n3-n4 = "+result);
        result=(n1+n2)*(n3-n4);
        System.out.println("(n1+n2)*(n3-n4) = "+result);

        // برنامج يطرح لك عددين

        System.out.println(" enter the first number");
        int oo = input.nextInt();

        System.out.println("enter the second number");

        int pp = input.nextInt();

        System.out.printf("your result is %d", oo - pp);

        ///////////////////////////

        /////////////////////////////

        // برنامج يطلب منك ادخال راتبك ويقوم بتقييمه


        System.out.println(" enter your salary");

        float salary1 = input.nextFloat();
        if (salary1 > 1000.8) {
            System.out.println(" your wage is good");

        } else if (salary1 < 9000.9) {

            System.out.println("your wage is not bad");
        } else if (salary1 <= 20000) {

            System.out.println("your wage are big and good");
        } else if (salary1 <= 1000.4) ;
        {
            System.out.println("your wage is soo small nit good");
        }


        /////////////////////////////////////

        ////برنامج يحسب لك القريد في مادة معينه
        System.out.println("enter your mark");
        double marks = input.nextFloat();

        if (marks >= 95) {
            System.out.println("you get A+");

        } else if (marks >= 90) {

            System.out.println(" you get A");
        } else if (marks >= 85) {

            System.out.println("you get B+");
        } else if (marks >= 80) {

            System.out.println("you get B");
        } else if (marks >= 75) {

            System.out.println("you get C+");
        } else if (marks >= 70) {

            System.out.println("you get C");
        } else if (marks >= 65) {

            System.out.println("you get D+");
        } else if (marks >= 59.01) {

            System.out.println("you get D");
        } else {
            System.out.println("you get F");
        }

        ///////////////////////////

        ////لعبة تخمين الوجة او الصورة ولكن ب استخدام 1 او 0
        int guess1 ,  random;

        System.out.print("Enter a guess(0 or 1)");
        guess1 = read.nextInt();

        if(guess1 == 0 || guess1 == 1) {
            random = (int)(Math.random() * 2);

            if(guess1 == random) {
                System.out.print("You won");
            }
            else {
                System.out.print("You lose");
            }
        }
        else
        {
            System.out.print("wrong");
        }

        //هذا البرنامج لحساب ايام الأسبوع
        System.out.println(" enter the number of the day");
        byte day = input.nextByte();

        if (day == 1) {
            System.out.println(" ألأخد");
        } else if (day == 2) {

            System.out.println(" الاثنين");
        } else if (day == 3) {

            System.out.println(" الثلاثاء");
        } else if (day == 4) {

            System.out.println(" الأربعاء ");
        } else if (day == 5) {

            System.out.println(" الخميس");
        } else if (day == 6) {

            System.out.println(" الجمعة");
        } else if (day == 7) {

            System.out.println(" السبت");
        }

        /////////////////////////////

        //هذا البرنامج راح يحسب عدد اشهر السنه


        byte month = input.nextByte();

        if (month == 1) {
            System.out.println(" محرم");
        } else if (month == 2) {

            System.out.println(" صفر");
        } else if (month == 3) {

            System.out.println(" ربيع الأول");
        } else if (month == 4) {

            System.out.println(" ربيع الاخر ");
        } else if (month == 5) {

            System.out.println(" جمادى ألأولى");
        } else if (month == 6) {

            System.out.println(" جمادى الاخره");
        } else if (month == 7) {

            System.out.println(" رجب");
        } else if (month == 8) {

            System.out.println(" شعبان");
        } else if (month == 9) {

            System.out.println(" رمضان");
        } else if (month == 10) {

            System.out.println(" شوال");
        } else if (month == 11) {

            System.out.println(" ذو القعدة");
        } else if (month == 12) {

            System.out.println(" ذو الحجة");
        }

        ////////////////////////////////

        ////برنامج الة حاسبة باسخدام if else
        System.out.println("welcome, please enter the first number: ");
        int num122=input.nextInt();
        System.out.println("please enter the second number: ");
        int num222=input.nextInt();
        System.out.println("choose operation you want to apply:\n1.summation\n2.subtraction\n3.multiplication\n4.division");
        int choice=input.nextInt();
        int result111=0;
        if(choice==1)
        {
            result111=num122+num222;
        }
        else if(choice==2)
        {
            result111=num122 - num222;
        }
        else if(choice==3)
        {
            result111=num122*num222;
        }
        else if(choice==4)
        {
            result111=num122/num222;
        }
        System.out.println("result is "+result111);

        ///////////////////////////////////////////////////

        //هذا البرنامج يحسب درجتك بالقدرات

        System.out.println("ادخل درجة اللفظي");
        double mark1 = input.nextFloat();

        System.out.println("ادخل درجة الكمي");
        double mark2 = input.nextFloat();

        double res = mark1 * mark2 / 2;

        System.out.println(" نتيجتك في القدرات هي" + res);

        //////////////////////////////////////

        // هذا البرنامج يحسب لك من ألأحاد الى االملايين


        System.out.println("enter number");

        int num22 = input.nextInt();

        if (num22 >= 0 && num22 <= 9) {
            System.out.println("احاد");

        } else if (num22 >= 10 && num22 <= 90) {
            System.out.println("عشرات");

        } else if (num22 >= 100 && num22 <= 900) {
            System.out.println("مئات");

        } else if (num22 >= 1000 && num22 <= 9000) {
            System.out.println("ألوف");

        } else if (num22 >= 10000 && num22 <= 90000) {
            System.out.println("عشرات ألوف");

        } else if (num22 >= 100000 && num22 <= 900000) {
            System.out.println("مئات ألألوف");

        } else if (num22 >= 1000000 && num22 <= 9000000) {
            System.out.println("ملايين");
        }

        /////////////////////////

        // هذا البرنامج يرى هل انت راسب ام لا

        System.out.println("enter your marks");

        byte mark9 = input.nextByte();

        if (mark9 >= 60) {
            System.out.println("you did pass");
        } else {
            System.out.println(" you field");
        }

        /////////////////////////

        ////برنامج يحسب لك قريد الجامعة
        System.out.println("enter your mark");
        double marks9 = input.nextFloat();

        if (marks9 >= 95) {
            System.out.println("you get A+");

        } else if (marks9 >= 90) {

            System.out.println(" you get A");
        } else if (marks9 >= 85) {

            System.out.println("you get B+");
        } else if (marks9 >= 80) {

            System.out.println("you get B");
        } else if (marks9 >= 75) {

            System.out.println("you get C+");
        } else if (marks9 >= 70) {

            System.out.println("you get C");
        } else if (marks9 >= 65) {

            System.out.println("you get D+");
        } else if (marks9 >= 59.01) {

            System.out.println("you get D");
        } else {
            System.out.println("you get F");
        }


        //////////////////////////////////////

        // برنامج الحاسبة

        System.out.println("enter your choice");
        int numb1, numb2;
        System.out.println("1. الجمع ");
        System.out.println("2. الطرح");
        System.out.println("3.الضرب ");
        System.out.println("4.القسمة ");
        System.out.println("5.الدبل ");
        int choice4 = read.nextInt();
        switch (choice4) {
            case 1 -> {
                System.out.println("Add");
                numb1 = read.nextInt();
                numb2 = read.nextInt();
                System.out.println(numb1 + numb2);
            }
            case 2 -> {
                System.out.println("substance");
                numb1 = read.nextInt();
                numb2 = read.nextInt();
                System.out.println(numb1 - numb2);
            }
            case 3 -> {
                System.out.println("multiply");
                numb1 = read.nextInt();
                numb2 = read.nextInt();
                System.out.println(numb1 * numb2);
            }
            case 4 -> {
                System.out.println("dividing");
                numb1 = read.nextInt();
                numb2 = read.nextInt();
                System.out.println(numb1 / numb2);
            }
            case 5 -> {
                System.out.println("square");
                numb1 = read.nextInt();
                if (numb1 > 0)
                    System.out.println(numb1 * numb1);
                else
                    System.out.println(" wrong choice");
            }
            default -> System.out.println(" wrong choice");
        }

            //////////////////////////////

        // /////// برنامج يحسب لك متوسط درجات الطلاب واذا بغيت تنهي البرنامج تكتب 1-
        int grade = 0, sum = 0, counter = 1;

        System.out.println(" enter grades to see the average or -1 to exit");
        while (counter <= 6 && grade != -1) {
            System.out.println("enter grade for student " + counter);
            grade = read.nextInt();


            sum += grade;

            counter++;
        }

        System.out.println(" the average for student is " + sum / 6);


        //////////////////////////////////////

        ////برنامج يطبع 50 مره كلمة Java
        int i8=1;
        while(i8<=50) {
            System.out.println("Java");
            i8++;
        }


        /// /برنامج يطلب من المستخدم يدخل رقم صحيح ولو دخل رقم سالب ينتهي البرنامج
        double sum2 = 0.0;
        double value;

        boolean positive = true;

        while (positive) {

            System.out.println("enter the positive number ");

            value = read.nextDouble();

            if (value < 0) {
                positive = false;

            } else {

                sum2 += value;
            }

        }
        System.out.println(" the sum of values is " + sum2);


        ///////////////////////////////

        ////لُعْبَة تطلب من المستخدم يخمن الرقم الي اختارته العبه
        int guess, rand;

        rand = (int) (Math.random() * 100);
        boolean play = true;

        System.out.println(" the guess is" + rand);
        while (play) {

            System.out.println(" guess the true");

            guess = read.nextInt();

            if (guess > rand) {

                System.out.println(" its is soo big");

            } else if (guess < rand) {

                System.out.println(" its is soo big");

            } else {
                System.out.println(" you win !");
                play = false;
            }


        }

        ////////////////////////////////////////

        ////برنامج عبارة عن لوب داخله حاسبة باستخدام أوآمر switch ويعرض قائمة للحاسبه
        int numb7 , numb8 , option ;
        do {
            System.out.println("enter your choice");
            System.out.println("1. الجمع ");
            System.out.println("2. الطرح");
            System.out.println("3.الضرب ");
            System.out.println("4.القسمة ");
            System.out.println("5.الدبل ");
            System.out.println(" 0.للخروج");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add");
                    numb7 = read.nextInt();
                    numb8 = read.nextInt();
                    System.out.println(numb7 + numb8);
                    break;
                case 2:
                    System.out.println("substance");
                    numb7 = read.nextInt();
                    numb8 = read.nextInt();
                    System.out.println(numb7 - numb8);
                    break;
                case 3:
                    System.out.println("multiply");
                    numb7 = read.nextInt();
                    numb8 = read.nextInt();
                    System.out.println(numb7 * numb8);
                    break;
                case 4:
                    System.out.println("dividing");
                    numb7 = read.nextInt();
                    numb8 = read.nextInt();
                    System.out.println(numb7 - numb8);
                    break;
                case 5:
                    System.out.println("square");
                    numb7 = read.nextInt();
                    if (numb7 > 0)
                        System.out.println(numb7 * numb7);
                    else
                        System.out.println(" wrong choice");
                    break;
                case 0:
                    System.out.println(" good by");

                default:
                    System.out.println(" wrong choice");

            }
        } while (option != 0 );

         ////برنامج لحساب متوسط الدرجات باستخدام for
        int grades , sum11 = 0 ;
        for (int counter3 = 1; counter3++ <= 6;){

            System.out.println("enter your grade" + counter3);

            grades= read.nextInt();
            sum11+= grades;
        }
        System.out.println("the average is "+ sum11 / 6 );


        //////////////////////////////////////


        ////برنامج يطلب أرقام ويجمع الأرقام الزوجية لحال ويجمع الأرقام الفردية لحال
        int nu2 , sumeven = 0, sumobb =0;

        for (int i = 1 ;  i++ <10 ;){

            System.out.println(" enter this number" + i);
            nu2= read.nextInt();

            if( nu2 %2==0){

                sumeven+= nu2;
            } else{

                sumobb +=nu2;

            }
        }
        System.out.println("the sum of even" + sumeven );
        System.out.println("the sum of obb" + sumobb);

        ////////////////////////////////

        ////برنامج يطبع100 مره كلمة "Java"

        for(int i=1;i<=100;i++)
        {
            System.out.println("Java");
        }
        /////////////////


        ////برنامج يطبع الارقام من 1 الى 50

        for(int i=1;i<=50;i++)
        {
            System.out.println(i);
        }

        /////////////////////////


        ////برنامج يطبع الاعداد الزوجيه فقط من 1 الى 50

        for(int i=0;i<=50;i++)
        {
            if(i%2 == 0)
                System.out.println(i);
        }

        /////////////////////////////////

        ////
        // //برنامج لحساب عامل اي رقم موجب


        int nn , factorial =1 ;

        for( int f =1 ; f<= 6; f++) {
            System.out.println("enter positive number" + f);

            nn = read.nextInt();
            if (nn < 0) {
                System.out.println(" enter again positive number");
            } else {

                for (int i = 1; i <= nn; i++) {

                    factorial = factorial * i;
                }
            }

            System.out.println("factorial is  " + factorial);
        }


        ///////////////////////////////////////////

        ////برنامج يحسب درجات الطلاب باستخدام while loop وفي حال إدخال رقم بالسالب ينهي البرنامج
        ////وأذا ادخل الرقم 0 ينتهي البرنامج ويحسب متوسط الدرجات السابقة
        int grade8 = 1 , sum8 = 0, counter8 = 1;

        System.out.println(" enter grades to see the average ");
        while (counter8 <= 6  && grade8  !=0) {
            System.out.println("enter grade for student " + counter8);
            grade8 = read.nextInt();

            if ( grade8 < 0){

                System.out.println(" negative numbers are not allowed");
                break;
            }

            sum8 += grade8;

            counter8++;
        }


        ///////////////////////////////////////////

        /////نفس البرنامج السابق ولكن هنا اذا دخل رقم سالب يجبره البرنامج يعيد الرقم مع رسالة تبين انه غلط يحط رقم سالب
        System.out.println(" the average for student is " + sum8 / 6);

        int grade9  = 1 , sum9  = 0, counter9 = 1;

        System.out.println(" enter grades to see the average ");
        while (counter9 <= 6  && grade9 !=0) {
            System.out.println("enter grade for student " + counter8);
            grade8 = read.nextInt();

            if ( grade8 < 0){

                System.out.println(" negative numbers are not allowed");
                continue;
            }

            sum9 += grade8;

            counter8++;
        }

        System.out.println(" the average for student is " + sum9 / 6);

        ////////////////////////////

        ////برنامج يطلب من المسافرين ادخال وزن الحقائب واذا كان اعلى من المطلوب ياخذ على كل كيلو 10 ريال


        int pclass , numberofpeople ;
        double weight , exceesweight , charge = 0 ;

        System.out.println(" please enter the number of people");
        numberofpeople= read.nextInt();

        for (int counter22 = 1 ; counter22 <= numberofpeople ; counter22++) {

            System.out.println("enter the class of traveler " + counter22);

            System.out.println(" 1 is first class");

            System.out.println(" 2 is second class");

            System.out.println(" 3 is third class");
            pclass = read.nextInt();

            if (pclass > 3 || pclass < 1) {

                System.out.println(" wrong class");

                break;
            }

            System.out.println("enter the bag weight of traveler " + counter22);
            weight = read.nextDouble();

            switch (pclass) {

                case 1:
                    if (weight > 30) {

                        exceesweight = weight - 30;

                        charge = exceesweight * 10;

                    }
                    break;
                case 2:
                    if (weight > 25) {

                        exceesweight = weight - 25;

                        charge = exceesweight * 10;

                    }
                    break;

                case 3:
                    if (weight > 20) {

                        exceesweight = weight - 20;

                        charge = exceesweight * 10;

                    }


                    break;

                default:
                    System.out.println(" you did enter wrong class");
            }
            System.out.println(" you have to pay extra charge it is " + charge);

        }

        ///////////////////////////////////////////


        ////هذا البرنامج نفس الي قبل بس ألإضافة الي هنا انه تقدر تقسمهم الى قروبات بدال ماكانو محصورين بقروب واحد
        ////مثلا تقدر تقسمهم وتقول هذا قروب الي يدرسون هندسة وهذا للي يدرسون طب وهكذا

        int pclass1 , numberofpeople1 , numberofgroups  ;
        double weight1 = 1, exceesweight1 , charge1 = 0 ;
        String Nmaeofgroup;

        System.out.println("enter the number of groups ");
        numberofgroups= read.nextInt();

        for(int groupcounter = 1 ; groupcounter<= numberofgroups ; groupcounter++) {


            System.out.println(" please enter the name of travelers in this group and their numbers of group " + groupcounter );
            Nmaeofgroup= read.next();
            numberofpeople1 = read.nextInt();

            for (int counter22 = 1; counter22 <= numberofpeople1; counter22++) {

                System.out.println("enter the class of traveler " + counter22 + " in group " + Nmaeofgroup);

                System.out.println(" 1 is first class");

                System.out.println(" 2 is second class");

                System.out.println(" 3 is third class");
                pclass1 = read.nextInt();

                if (pclass1 > 3 || pclass1 < 1) {

                    System.out.println(" wrong class");

                    break;
                }

                System.out.println("enter the bag weight of traveler " + counter22);
                weight1 = read.nextDouble();

                switch (pclass1) {

                    case 1:
                        if (weight1 > 30) {

                            exceesweight1 = weight1 - 30;

                            charge1 = exceesweight1 * 10;

                        }
                        break;
                    case 2:
                        if (weight1 > 25) {

                            exceesweight1 = weight1 - 25;

                            charge1 = exceesweight1 * 10;

                        }
                        break;

                    case 3:
                        if (weight1 > 20) {

                            exceesweight1 = weight1 - 20;

                            charge1 = exceesweight1 * 10;

                        }


                        break;

                    default:
                        System.out.println(" you did enter wrong class");
                }
                System.out.println(" you have to pay extra charge it is " + charge);

            }
        }
        ////////////////

        ////برنامج يجمع الاعداد باستخدام دالة sum

        int r1 , t ;
        System.out.println("enter the first number");
        r1= read.nextInt();
        System.out.println("enter the second number");
        t= read.nextInt();
        System.out.println("the result is "+ sum(r1,t));

        /////////////////////////////////

        ////برنامج يطلب منك ادخال اليوم ويخبرك اذا كان اجازه او لا

        System.out.println("enter week day number:");
        int daynumber=input.nextInt();
        switch(daynumber) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("work days");
                break;
            case 1:
            case 7:
                System.out.println("vacation");
                break;
            default:
                System.out.println("wrong");
        }

        //////////////////////////////////////


        ////برنامج يقارن بين الاندرويد والايفون

        System.out.println("do yo like android or iphone");
        System.out.println("for android enter 1 or 2 for iphone");

        int phone = read.nextInt();

        if(phone == 1){

            System.out.println(" what is the type you have");

            System.out.println( "1. Samsung");
            System.out.println( "2. Huawei");
            System.out.println( "3. honor");
            int type = read.nextInt();
            switch (type){
                case 1:
                    System.out.println("it is a good choice");

                    break;
                case 2 :
                    System.out.println(" not bad choice");

                    break;

                case 3 :

                    System.out.println("it is close to bad");
                    break;

                default:
                    System.out.println(" wrong ");
            }
        }
        else {

            System.out.println("what is the type you have");

            System.out.println("1. iphone 14");
            System.out.println("2. iphone 13");
            System.out.println("3. iphone 12");
            System.out.println("4. iphone 11");
            System.out.println("5. iphone X");
            System.out.println("6. iphone XR");

            int type2 = read.nextInt();

            switch (type2){

                case 1:
                    System.out.println("it is soo good");


                    break;

                case 2 :

                    System.out.println(" less than before one and same");

                    break;

                case 3 :

                    System.out.println(" it is different than any one");
                    break;

                case 4 :

                    System.out.println(" it is the first change");
                    break;

                case 5 :
                    System.out.println(" it is the famous");
                    break;

                case 6 :

                    System.out.println("it is the boy of X");

                    break;

                default:
                    System.out.println("wrong");
            }
        }

        ////برنامج يطلب درجة كويز ويطبع اذا كان نجح في الكويز او لا

        System.out.println("enter your quiz mark from 10 ");
        int quiz=read.nextInt();
        switch(quiz)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("fail");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("pass");
            default: System.out.println(" wrong ");
        }

        //////////////////////////

        ////نفس البرنامج السابق ولكن باستخدام if else

        System.out.println("enter the quiz mark");
        int mark=input.nextInt();
        if(mark>=6 && mark<=10)
            System.out.println("pass");
        else if(mark>=0 && mark<6)
            System.out.println("fail");
        else {
            System.out.println("wrong");
        }


        ////////////////////////


        ////برنامج يحسب متوسط درجات الطلاب

        int grade7 = 1 , sum99 = 0, counter99 ;

        System.out.println("1. علوم الحاسب");
        System.out.println("2.هندسة الحاسب");
        System.out.println("3.تقنية المعلومات");
        System.out.println(" فضلا اختر رقم التخصص المراد تصحيحه");
        int major4 = read.nextInt();
        if (major4 < 0) {
            System.out.println(" الارقام السالبة غير مسموح فيها");

        } else {
            switch (major4) {
                case 1, 2 , 3-> {
                    System.out.println(" ادخل عدد الطلاب المراد حساب درجاتهم ");
                    int grade22 = read.nextInt();
                    for (counter99 = 1; counter99 <= grade22 && grade7 != 0; counter99++) {
                        System.out.println("ادخل الدرجة للطالب رقم " + counter99);
                        grade7 = read.nextInt();

                        if (grade7 < 0) {

                            System.out.println(" الارقام السالبة غير مسموح فيها");
                            break;
                        }

                        sum99 += grade7;

                    }
                    System.out.println("متوسط درجات الطلاب هو " + sum99);
                }
            }
        }

        ///////////////////

        //// برنامج يقوم بفرز مبدئي ل المتقدمين على شركة معينه من خلال تخصصاتهم زمعدلاتهم وطباعة لهم رسالة قبول او رفض حسب معيارية القبول الموجودة

        byte major, major1, major2 ,major3,  agreen;
        float GBA;
        String f_name, s_name, th_name, uni_name, uni_name2, uni_name3;
        int ID;
        System.out.println("مرحبا بك في مرحلة القبول المبدئي");

        System.out.println("فضلا ادخل اسم جامعتك الأول");
        uni_name = read.next();

        System.out.println("ادخل اسم جامعتك الثاني");
        uni_name2 = read.next();

        System.out.println("ادخل اسم جامعتك الاخير");
        uni_name3 = read.next();

        System.out.println("ادخل اسمك الأول من فضلك ");
        f_name = read.next();

        System.out.println("ادخل اسمك الثاني من فضلك ");
        s_name = read.next();

        System.out.println("ادخل اسمك الأخير من فضلك ");
        th_name = read.next();

        System.out.println("فضلا ادخل رقم الهوية الوطنية");
        ID = read.nextInt();

        System.out.println("اذا كنت متأكد من اسم جامعتك وهي " + " " + uni_name + " " + uni_name2 + " " + uni_name3);
        System.out.println(f_name + " " + s_name + " " + th_name + " " + ID + " " + "واذا كان هذا اسمك " + " وكانت هذه هويتك فاكتب رقم 1");
        agreen = read.nextByte();
        if (agreen == 1)
            System.out.println("فضلا اختر تخصصك من التخصصات أدناه");
        System.out.println("1- تخصصات الهندسة");
        System.out.println("2- تخصصات ادارة الأعمال");
        System.out.println("3- تخصصات الحاسب");

        major = read.nextByte();

        switch (major) {
            case 1 -> {
                System.out.println("فضلا قم باختيار تخصصك");
                System.out.println("1- الهندسة الكهربائية");
                System.out.println("2- الهندسة الميكانية");
                System.out.println("3- الهندسة المدنية");
                System.out.println("4- الهندسة المعمارية");
                System.out.println("5- الهندسة الكيميائية");
                System.out.println("6- الهندسة النووية");
                major1 = read.nextByte();
                switch (major1) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.10) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.50) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.78) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.15) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 5 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.20) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 6 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.12) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    default -> System.out.println("خيار خاطئ");
                }


            }

            case 2 -> {
                System.out.println("فضلا اختر تخصصك من التخصصات ادناه");
                System.out.println("1- المحاسبة");
                System.out.println("2- نظم المعلومات ألإدارية");
                System.out.println("3- الإدارة الصحية");
                System.out.println("4- الإدارة العامة");
                System.out.println("5- الإقتصاد ");
                System.out.println("6- التسويق");
                System.out.println("7- الإدارة المالية");
                major2 = read.nextByte();
                switch (major2) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.22) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.09) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.01) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.04) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 5 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.07) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 6 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.02) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 7 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.44) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    default -> System.out.println(" خيار خاطئ");
                }
            }
            case 3 -> {
                System.out.println("فضلا اختر تخصصك من القائمة ادناه");
                System.out.println("1- هندسة الحاسب");
                System.out.println("2- هندسة البرمجيات");
                System.out.println("3- علوم الحاسب");
                System.out.println("4- تقنية المعلومات");
                major3 = read.nextByte();
                switch (major3) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.08) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }

                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.00) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");

                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.07) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.01) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }

                    }
                    default -> System.out.println("خيار خاطئ");
                }
            }
        }


        /////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////



        //// برنامج يعرض لك شركات سيارات وسطلب منك اختيار الشركة ونوع السيارة ويعطيك سعرها

        System.out.println("وش نوع شركة السيارة الي تفضلها ؟");

        System.out.println("1. تويوتا");
        System.out.println("2. نيسان");
        System.out.println("3. هيونداي");
        System.out.println("4. هوندا");
        System.out.println("5. فورد");

        int car = read.nextInt();

        switch (car){

            case 1 :
                System.out.println(" وش السيارة الي تفضلها ؟");

                System.out.println("1. لاند كروزر");
                System.out.println("2. لاند كروز شاص");
                System.out.println("3. لاند كروزر ربع");
                System.out.println("4. كامري");
                System.out.println("5. افالون");
                System.out.println("6. يارس");

                int car2 = read.nextInt();

                switch (car2){

                    case 1 :
                        System.out.println(" سعره حوالي 700 الف");

                        break;
                    case 2:

                        System.out.println(" سعره حوالي ال200 الف");

                        break;
                    case 3 :

                        System.out.println("  سعرها حوالي ال190 الف");

                        break;

                    case 4:
                        System.out.println(" سعرها حوالي ال140 الف");

                        break;
                    case 5:

                        System.out.println(" سعرها حوالي ال 100 الف");

                    default:
                        System.out.println(" خيار خاطئ");

                        break;


                }
                break;

            case 2 :

                System.out.println(" وش السيارة الي تفضلها ؟");

                System.out.println("1. باترول بلاتينيوم");
                System.out.println("2. باترول 4800");
                System.out.println("3. باترول 4500");
                System.out.println("4.التيما");
                System.out.println("5.صني");

                int car3 = read.nextInt();
                switch (car3){

                    case 1 :
                        System.out.println(" سعره حول ال500 الف");

                        break;

                    case 2 :
                        System.out.println(" سعرها حول ال200 الف");

                        break;

                    case 3 :
                        System.out.println(" سعره حول ال170 الف");

                        break;

                    case 4 :

                        System.out.println(" سعرها حول حول ال120 الف");
                        break;

                    case 5:
                        System.out.println(" سعرها حول ال100 الف");

                        break;

                    default:

                        System.out.println(" خيار خاطئ");

                        break;

                }
                break;


            case 3:

                System.out.println(" وش السيارة الي تفضلها ؟");

                System.out.println("1. سوناتا");
                System.out.println("2. اكسنت");
                System.out.println("3. كونا");
                System.out.println("4. ازيرا");

                int car4 = read.nextInt();

                switch (car4){

                    case 1 :
                        System.out.println("سعرها حوالي ال140 الف");

                        break;

                    case 2 :
                        System.out.println("سعرها حوالي ال 80 الف");

                        break;

                    case 3 :
                        System.out.println(" سعرها حوالي ال 120 الف");

                        break;

                    case 4 :

                        System.out.println(" سعرها حوالي ال170 الف");

                        break;

                    default:
                        System.out.println(" خيار خاطئ");

                        break;
                }

                break;


            case 4 :
                System.out.println("وش السيارة الي تفضلها ؟");

                System.out.println("1. اكورد");
                System.out.println("2. سيفيك");

                int car5 = read.nextInt();

                switch (car5){

                    case 1 :
                        System.out.println(" سعرها حوالي ال150 الف");

                        break;

                    case 2 :
                        System.out.println(" سعرها حوالي ال 100 الف");

                        break;

                    default:
                        System.out.println(" خيار خاطئ");

                        break;
                }

                break;

            case 5 :

                System.out.println(" وش السيارة الي تفضلها ؟");

                System.out.println("1. تورس");
                System.out.println("2. اكسبلور");
                System.out.println("3. موستتق");
                System.out.println("4. رابتر");

                int car6 = read.nextInt();

                switch (car6){

                    case 1 :
                        System.out.println(" سعرها حول ال160 الف");

                        break;

                    case 2 :
                        System.out.println(" سعره حوالي ال200 الف");

                        break;

                    case 3 :

                        System.out.println(" سعرها حول ال 240 الف");


                        break;

                    case 4 :

                        System.out.println(" سعره حوالي ال400 الف");

                        break;

                    default:
                        System.out.println(" خيار خاطئ");

                        break;
                }
                break;
        }


        /////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////


        ////برنامج ل استقبال رواتب الموظفين وحفظها داخل مصفوفة ثم حساب مجموعها والمتوسط الحسابي لها
        System.out.println("enter the number of employees");

        int num = read.nextInt();
        double[] salaries = new double[num];

        for (int i =0 ; i<salaries.length; i++){

            System.out.println("enter the salaries of employee" + (i+1));

            salaries[i] = read.nextDouble();

        }

        double sum44= 0 ;
        for (int i =0 ; i< salaries.length ; i++){
            sum+= salaries[i];
        }

        System.out.println("the sum of salaries is" + sum44);
        System.out.println("the average of salaries is" + sum44/ salaries.length);


        /////////////////////////////////

        ////برنامج لحساب متوسط اعداد موجبة فقط باستخدام المصفوفات

        System.out.println("enter the size of numbers");

        int num88 = read.nextInt();
        int[] numbers = new int[num88];

        for (int i =0 ; i<numbers.length; i++){

            System.out.println("enter the number " + (i+1));

            numbers[i] = read.nextInt();

        }

        int sum88= 0 , count = 0;
        for (int i =0 ; i< numbers.length ; i++){

            if(numbers[i]>0)

                sum88 += numbers[i];
            count++;

        }
        System.out.println("the average of positive numbers  is" + sum88/ count);

        ////////////////////////////////////////////////

        ////برنامج لحساب عدد الطلاب واعمارهم ومتوسط اعمارهم
        int student_number;

        System.out.println("enter the number of student");


        student_number = read.nextInt();
        String[] student_name = new String[student_number];

        for (int i = 0; i < student_name.length; i++) {

            System.out.println(" enter the name of student number" + (i + 1));

            student_name[i] = read.next();
        }
        byte[] student_age = new byte[student_number];

        for (int i = 0 ; i<student_age.length; i++ ){
            System.out.println("enter the age for the student number" + (i+1));

            student_age[i] = read.nextByte();
        }

        byte sum65= 0 ;
        for (byte b : student_age) {

            sum65 += b;
        }
        System.out.println("the students name : " + Arrays.toString(student_name));
        System.out.println("the ages for the student : " + Arrays.toString(student_age));
        System.out.println("the average of age for the student : " + sum/ student_age.length);


        ////////////////////

        ////برنامج باستخدام المصفوفات يدخل عدد الموظفين واسمائهم
        int number_of_employees;
        System.out.print("How many employee you will enter ?");
        number_of_employees=input.nextInt();

        String[] employees_names=new String[number_of_employees];
        for (int i = 0; i<number_of_employees;i++)
        {
            System.out.print("enter name of employee number"+(i+1));
            employees_names[i]=input.next();
        }
        for (int j = 0; j<employees_names.length;j++)
        {
            System.out.println(employees_names[j]);
        }

        //// برنامج باستعمال دالة ادخال ال array و دالة طباعة ال array ودالة البحث في اي array
        ////يقوم البرنامج بطلب حجم ال array  ثم يطلب ادخال بيانات ال array ثم يطبع بيانات ال array  ثم يطلب من المسنخدم البيانات الي يبغى يبحث عنها
        int size, search, returnedindex;

        System.out.println("enter the size of the array");
        size= read.nextInt();
        int[] sss = new int[size];

        store(sss);
        print(sss);

        System.out.println(" enter the value you want search");
        search = read.nextInt();

        returnedindex = search(sss,search);

        if (returnedindex >= 0)
            System.out.println("the value is found");
        else
            System.out.println("the value is not found");

        ///////////////////////////////////////////////

    //// برنامج باستخدام  [][]array يطلب من المستخدم ادخال البيانات لكل صف وعامود باستخدام ثلاث دول ل [][]array

        int[][] marks1 = new int[5][3];

        store(marks1);
        print(marks1);
        int total = sumarray(marks1);

        System.out.println(total);
    }


    /////////////////

    ////دوال جاهزة لتخزين بيانات من نوع int و double و String و byte و float

    public static void store (int[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println("enter the element number "+ (i+1));
            array[i]= read.nextInt();
        }
    }
    public static void store (double[] array){

        for (int i = 0 ; i<array.length ; i++){

            System.out.println("enter the element number "+ (i+1));
            array[i]= read.nextDouble();
        }
    }
    public static void store (String[] array){

        for (int i = 0 ; i<array.length ; i++){

            System.out.println("enter the element number "+ (i+1));
            array[i]= read.next();
        }
    }
    public static void store (float[] array){

        for (int i = 0 ; i<array.length ; i++){

            System.out.println("enter the element number "+ (i+1));
            array[i]= read.nextFloat();
        }
    }
    public static void store (byte[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println("enter the element number "+ (i+1));
            array[i]= read.nextByte();
        }
    }

    ///////////////////////////////

    ////دوال جاهزة لطباعة بيانات من نوع int و double و String و byte و float

    public static void print (int[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println(array[i]);
        }
    }

    public static void print (double[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println(array[i]);
        }
    }
    public static void print (String[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println(array[i]);
        }
    }
    public static void print (byte[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println(array[i]);
        }
    }
    public static void print (float[] array){


        for (int i = 0 ; i<array.length ; i++){

            System.out.println(array[i]);
        }
    }


    //////////////////////////

    ////دوال جاهزة للبحث داخل دوال اخرى عن قيمة معينه

    public static int search (int[] array , int target){

        for (int i = 0 ; i<array.length ; i++)

            if(array[i] == target)
                return i;
        return -1 ;
    }
    public static int search (double[] array , double target){

        for (int i = 0 ; i<array.length ; i++)

            if(array[i] == target)
                return i;
        return -1 ;
    }
    public static int search (String[] array , String target){

        for (int i = 0 ; i<array.length ; i++)

            if(array[i] == target)
                return i;
        return -1 ;
    }
    public static int search (byte[] array , byte target){

        for (int i = 0 ; i<array.length ; i++)

            if(array[i] == target)
                return i;
        return -1 ;
    }
    public static int search (float[] array , float target){

        for (int i = 0 ; i<array.length ; i++)

            if(array[i] == target)
                return i;
        return -1 ;
    }


    ////////////////////////////////////////////

    ////دوال [][]array جاهزة ل ادخال البيانات من نوع  int و double  و  float  و byte  و String

    public static void store(int[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = read.nextInt();
            }
        }
    }

    public static void store(double[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = read.nextInt();
            }
        }
    }

    public static void store(float[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = read.nextInt();
            }
        }
    }

    public static void store(byte[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = (byte) read.nextInt();
            }
        }
    }


    public static void store(String[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = String.valueOf(read.nextInt());
            }
        }
    }

    ///////////////////////////////

    ////دوال [][]array من نوع  int  و  double  و float  و byte  و  String
    public static void print(int[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println(array[row][column]);
            }

        }
    }

    public static void print(double[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println(array[row][column]);
            }

        }
    }

    public static void print(float[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println(array[row][column]);
            }

        }
    }

    public static void print(String[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println(array[row][column]);
            }

        }
    }

    public static void print(byte[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println(array[row][column]);
            }

        }
    }

    //////////////////////////////////////

    ////دوال [][]array جاهزه للجمع من نوع int و byte و double و float
    public static int sumarray(int[][] array) {

        int sum = 0;
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {

                sum += array[row][column];
            }
        }
        return sum;
    }
    public static double sumarray(double[][] array) {

        int sum = 0;
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {

                sum += array[row][column];
            }
        }
        return sum;
    }

    public static byte sumarray(byte[][] array) {

        int sum = 0;
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {

                sum += array[row][column];
            }
        }
        return (byte) sum;
    }

    public static float sumarray(float[][] array) {

        int sum = 0;
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {

                sum += array[row][column];
            }
        }
        return sum;
    }

    //////////////////////////////////

    ////دوال للجمع والطرح والضرب والقسمه

    public static int sum(int num1,int num2)
    {
        int result=num1+num2;
        return result;
    }

    public static int subtract(int num1,int num2)
    {
        int result=num1-num2;
        return result;
    }

    public static int multiply(int num1,int num2)
    {
        int result=num1*num2;
        return result;
    }

    public static int divide(int num1,int num2)
    {
        int result=num1/num2;
        return result;
    }
}







