public class Main {
    public static void main(String[] args) {
        /*
        1. დაწერეთ პროგრამა, რომელიც გადაიყვანს ცელსიუსებს ფარენჰეიტებში
         */

        int celsius = 15;
        int fahrenheit = (celsius - 32) * 5 / 9;
        System.out.println(fahrenheit);

        /*
        2.დაწერეთ პროგრამა, რომელიც გადაიყვანს ფარენჰეიტებს ცელსიუსებში.
         */

        int F = 15;
        int C = (F * 9 / 5) + 32;
        System.out.println(C);


        /*
        დაწერეთ პროგრამა, რომელიც ამოწმებს არის თუ არა მითითებული
        წელიწადი ნაკიანი (თევერვალში არის თუ არა 29 დღე) თუკი წელიწადი
        თან ნაკიანია და თან 100-ზე იყოფა მაშინ დაბეჭდეთ, რომ ნაკიანი არ
        არის, მაგრამ თუ 400-ზე იყოფა ისევ ნაკიანად ჩათვალეთ.
         */

        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0){
                System.out.println("nakiania");
            } else {
                System.out.println("araa nakiani");
            }
        }
        if (year % 4 != 0 ){
            if (year % 400 == 0){
                System.out.println("nakiania");
            }else {
                System.out.println("araa nakiani");
            }
        }

        /*
        4. დაწერეთ პროგრამა, რომელსაც შემოსდის ორი ნებისმიერი რიცხვი და
        თქვენმა პროგრამამ უნდა დაადგინოს საკოორდინატო სიბრტყის რომელ
        მეოთხედშია მოთავსებული ეს წერტილი.
         */

        int x = 2;
        int y = -3;

        if (x > 0){
            if (y > 0){
                System.out.println("pirvel meotxedshia");
            }
            if (y < 0){
                System.out.println(" meotxe meotxedshia");

            }
        }
        if (x == 0){
            if (y == 0){
                System.out.println("centria");
            }
        }
        if (x < 0){
            if (y > 0){
                System.out.println("meore meotxedshia");
            }
            if (y < 0){
                System.out.println("mesame meotxedshia");
            }
        }

        /*
        დაწერეთ პროგრამა, რომელსაც სტრინგის სახით შემოსდის ოთხი
        სიმბოლოდან რომელიმე + - * / და დამატებით 2 რიცხვი. თქვენმა
        პროგრამამ უნდა გაიაზროს რა ოპერაციას გულისხმობს მომხმარებელი
        და შეასრულოს მოქმედება მოცემულ ორ რიცხვზე და დაბეჭდოს პასუხი.
         */

        char ans_1 = '+';
        char ans_2 = '-';
        char ans_3 = '*';
        char ans_4 = '/';
        char ans_5 = '5';
        char ans_6 = '6';

        int ans_5_v2 = (int) ans_5;
        int ans_6_v2 = (int) ans_6;

        ???????








    }
}