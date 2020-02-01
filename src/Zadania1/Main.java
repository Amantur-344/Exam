package Zadania1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[99];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 != 0) {
                hashSet.add(arr[i]);//Добавил ихи первыми что бы в дальнейшем они передвинулись в конец
            } else {
            }
        }
            if(arr[i] % 5 == 0){
                hashSet.add(arr[i]);
            }

    }

}
