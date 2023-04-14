public  class NumberOne {
    public void startArray() {
        int[] array = {234, 200, 3, 40000, 1, 6000009};
        System.out.print("Первоначальный массив: ");
        for (int g : array) {
            System.out.print(g + " ");}
        System.out.println();
    }


    public void NumberOneArray(){

        int[] array = {234, 200, 3, 40000, 1, 6000009};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                }
            }
        }
        System.out.print("Сортировка массива: [");
        for (int v : array){
            System.out.print(v + " ");;
        }
        System.out.print("]");
    }
}

