package mindcraft.Assignment_04;

public class Arg_vrg {


        static int add(int... numbers) {

            int sum = 0;

            for (int num : numbers) {
                sum = sum + num;
            }

            return sum;
        }

        public static void main(String[] args) {

            System.out.println("Sum = " + add(10, 20));
            System.out.println("Sum = " + add(10, 20, 30));
            System.out.println("Sum = " + add(10, 20, 30, 40, 50));
        }
    }

