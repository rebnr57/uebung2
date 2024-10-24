public class Main {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 8, 11};
        /*
        do
swapped = false
for i = 1 to indexOfLastUnsortedElement - 1 do
if leftElement > rightElement then swap(leftElement, rightElement) swapped = true
++swapCounter
end if end for
while swapped
         */
        System.out.println("\nUnsortiertes Array: ");
        for (int num : array) {
            //store the value of X
            System.out.print(num + "  ");
        }

        int numOfElements = array.length;
        System.out.println("\nLänge des Arrays: " + numOfElements);

        boolean swapped;
        int swapCounter = 0;
        do {
            swapped = false;

            for (int i = 1; i < numOfElements; i++) {

                if (array[i - 1] > array[i]) {

                    int indexofLastUnsortedElement = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = indexofLastUnsortedElement;
                    swapCounter++;
                }

            }
        } while (swapped);

        System.out.println(swapCounter);

        System.out.println("\nSortiertes Array: ");
        for (int num : array) {
            System.out.print(num + " ");

        }
    }

}


//binarySearch= Voraussetzung, array muss sortiert sein