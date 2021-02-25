import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Insertion Sort
        int[] array = {-13, 5, 102, -25, 0};

        int switcher; // wird außerhalb der Schleife initialisiert, damit die Variable nicht stirbt

        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length - i; j++) {

                System.out.println(Arrays.toString(array));

                if (array[j] > array[j + 1]) {

                    switcher = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = switcher;
                }
            }
        }

    }
}

/*for (int i = 1; i < sortieren.length ; i++) {
        for (int j = 0; j < sortieren.length - i ; j++) {
        System.out.println(Arrays.toString(sortieren));
        if (sortieren[j]>sortieren[j+1]){
        temp=sortieren[j];
        sortieren[j]=sortieren[j+1];
        sortieren[j+1]=temp;
        }
        }
        }*/