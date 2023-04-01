public class Hello {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("All is okay!");
        } else {
            System.out.println("AAAAA! Its an ALIEN!");
        }
        //Ternary operator:
        String makeOfCar = "AUDI";
        String myCar = "Nissan";
        boolean isNotAudi = makeOfCar != "AUDI";

        if (isNotAudi) {
            System.out.println("BUT I want an AUDI! SHIT!");
        }
        else {
            System.out.println("My AUDI (❁´◡`❁)");
        }

    }
}
