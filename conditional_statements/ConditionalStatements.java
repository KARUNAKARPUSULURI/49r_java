control statements -> it controls the flow of a program


-> Conditional statements -> based on a certain condition will be printing values (whether the condition is true or false)
a  =10 
++a > 10 

Types:- 
if -> 
if else -> 

if(true){
	.....
}
else if
switch

condition -> boolean expression
expression -> value
-> Loops
----------------------------------------
1. 
class Main {
    public static void main(String[] args) {
        int age = 20; //> , < , >=, <=, ==, !=
        if(age >= 18 && age <= 40){
            System.out.print("Come inside!!!");
        }
    }
}
----------------------------------------
2. 
class Main {
    public static void main(String[] args) {
        int age = 35;//> , < , >=, <=, ==, !=
        if(age >= 18){
            System.out.println("age is above 18 please check whether his age is below 40 or not");
            if(age <= 40){
                System.out.println("hello can i come inside?");
            }else{
                System.out.println("age exceeded");
            }
        }
    }
}
------------------------------------------------
3. 
class Main {
    public static void main(String[] args) {
        int num = 32;//> , < , >=, <=, ==, !=
        if((num & 1) == 1 ){
            System.out.print("odd");
        }else{
            System.out.print("even");
        }
    }
}
------------------------------------------------
4. 
class Main {
    public static void main(String[] args) {
        int num = -32;//> , < , >=, <=, ==, !=
        if(num > 0) {
            System.out.print("+ number");
        }else{
            System.out.print("- number");
        }
    }
}
---------------------------------------------
5. 
class Main {
    public static void main(String[] args) {
        int a = -25;
        int b = -0;
        int c = -28;
        if(a > b && a > c){
            System.out.print("A is greater :" + a);
        }else{
            if(b > a && b > c){
                System.out.print("B is greater :" + b);
            }else{
                System.out.print("C is greater :" + c);
            }
        }
    }
}
--------------------------------------------------
6.
class Main {
    public static void main(String[] args) {
        String name = "manasa";
        if(name == "manasa"){
            System.out.println("Name is verified, please pay the ticket amount");
            int amount = 10000;
            if(amount >= 8000){
                System.out.println("Amount paid, please go to onboarding!!");
                boolean boarding_pass = false;
                if(boarding_pass == true){
                    System.out.println("Please have your seat");
                }else{
                    System.out.println("please contact");
                }
            }else{
                System.out.println("Insufficient Amount");
            }
        }else{
            System.out.println("Invalid Name");
        }
    }
}
-------------------------------------------------------
7.
class Main {
    public static void main(String[] args) {
        String movie_name = "Kanappa";
        if(movie_name == "Kanappa"){
            System.out.println(movie_name + " Movie is avaible please go to tickets section");
            int price = 300;
            if(price < 200){
                System.out.println("Please select the seats");
                boolean isSeatsAvailable = true;
                if(isSeatsAvailable == true){
                    System.out.println("please make your payment");
                }else{
                    System.out.println("go to kubera movie");
                }
            }else{
                System.out.println("please focus on your career");
            }
        }else{
            if(movie_name == "kubera"){
                System.out.println(movie_name + " Movie is avaible please go to tickets section");
            }else{
                System.out.println("movies are not avilable");
            }
        }
    }  
}
-----------------------------------------------------------------------
class Main {
    public static void main(String[] args) {
        int grade = 55;
        if(grade >= 90 && grade <= 100){
            System.out.println("A grade");  
        }else if(grade >= 80 && grade <= 89){
            System.out.println("B grade");  
        }else if(grade >= 70 && grade <= 79){
            System.out.println("C grade");
        }
        else if(grade >= 60 && grade <= 69){
            System.out.println("D grade");
        }else{
            System.out.println("Fail");
        }
    }  
}







