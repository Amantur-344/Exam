package Zadacha2;

import java.awt.*;
import java.util.LinkedList;

public class Main{
    private static Object PointerInfo;

    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            personLinkedList.add(new Person("Ubaidilaev","Amantur","Sagynbekovich"));

            for (int j = 0; j < 20; j++) {
                if(personLinkedList.get(i).equals(personLinkedList.get(j))){
                    new MyException(j);
                }else{}
            }
        }

    }

}
