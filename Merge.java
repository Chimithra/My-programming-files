package zohoFirst;

class Merge {
    static int[] merge(int first[], int second[]) {
        System.out.println("Inside Merge");

        int i = 0, j = 0, k = 0;
        int[] mergeArr = new int[first.length + second.length];


        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mergeArr[k] = first[i];
                i++;
            } else {
                mergeArr[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mergeArr[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergeArr[k] = second[j];
            j++;
            k++;
        }
        return mergeArr;

    }

    static int[] mergeSort(int[] a) {
        int inputLength = a.length;
        int midIndex;

        if (inputLength < 2) {
            return a;
        }
        midIndex = inputLength / 2;

        int[] left = new int[midIndex];
        int[] right = new int[inputLength - midIndex];

        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }

        for (int j = midIndex; j < inputLength; j++) {
            right[j - midIndex] = a[j];
        }

        left = mergeSort(left);
        right = mergeSort(right);


        return merge(left, right);


    }

    /* Function to print the array */
    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[]) {
        int a[] = {3, 5, 2, 6, 7, 8, 4};

        int n = a.length;
        Merge m1 = new Merge();
        System.out.println("\nBefore sorting array elements are - ");
        m1.printArray(a, n);
        int b[] = m1.mergeSort(a);
        System.out.println("\nAfter sorting array elements are - ");
        m1.printArray(b, n);
        System.out.println("");
    }
}


