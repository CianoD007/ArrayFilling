public class ArrayFilling {

        public static void main(String[] args) {
            // Creating a 10-element array
            int[] numbers = new int[10];

            // Filling the array from 9 to 0 using a classic for loop
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = 9 - i;
            }

            // Displaying the values of the array using a for-each loop
            System.out.println("Array elements:");
            for (int num : numbers) {
                System.out.println(num);
            }
        }

}
