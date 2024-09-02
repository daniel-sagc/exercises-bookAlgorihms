public class Main {
    public static void main(String[] args) {

        //First Exercise book: Entendendo Algoritmos -> Busca Binaria

        int[] exampleList = {1,2,3,5,7};
        System.out.println(binarySearch(exampleList,7));
    }

    private static Integer binarySearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;

        while(low <= high){
            int middle = (low + high)/2;
            int kick = list[middle];
            if(kick == item){
                return middle;
            }
            if(kick > item){
                high = middle -1;
            } else {
                low = middle + 1;
            }
        }
        return null;
    }
}

