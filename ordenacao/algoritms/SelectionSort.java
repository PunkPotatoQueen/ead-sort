package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int n = arr.length;
        int chave = 0;
        for (int i = 0; i<n-1; i++){
            chave = i;
            for (int j = i+1; j <n; j++){
                if (arr[j]<arr[chave]){
                    chave = j;
                }
            }
            int troca = arr [chave];
            arr[chave] = arr[i];
            arr[i] = troca;
        
        }
        return arr;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
