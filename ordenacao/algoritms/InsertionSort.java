package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] arr) {
        //int [] sorted = arr.clone();
        int chave = 0;
        int contArr = 0;
        int a =0;
        for (int i = 1 ; i < arr.length; i++){
            chave = arr[i];
            contArr = i -1;
            while (contArr>0 && arr[i-1]>chave){
                a = arr[contArr];
                arr [contArr] = arr [contArr-1];
                arr [contArr-1] = a;
            }
            contArr--;
        }
        
        return arr;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
