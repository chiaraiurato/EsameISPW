package main;

import main.exceptions.OutOfIndexException;
import nameClass.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Sorting {


    private static List<Name> sortList(List<Name> a) throws OutOfIndexException {
        int size = a.size();
        if (size <= 0){
            throw new OutOfIndexException("The list is empty.");
        }
        String temp;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {

                if( a.get(i).getName().compareTo(a.get(j).getName()) > 0 ) {
                    temp =  a.get(i).getName();
                    a.get(i).setName(a.get(j).getName());
                    a.get(j).setName(temp);
                }
            }
        }
        return a;

    }

    public static void main( String[] args){
        List<Name> nameList = new ArrayList<>();

        nameList.add(new Name("Chiara"));
        nameList.add(new Name("andrea"));
        nameList.add(new Name("Andrea"));
        nameList.add(new Name("Edoardo"));
        nameList.add(new Name("Carla"));
        nameList.add(new Name("Paola"));
        nameList.add(new Name("Giulio"));
        nameList.add(new Name("Salvatore"));


        List<Name> sorted = null;
        try {
            sorted = sortList(nameList);
        } catch (OutOfIndexException e) {
            System.err.println("main.exceptions.OutOfIndexException error" + e.getMessage());
        }
        int index;
        int length = sorted.size();
        for(index = 0; index < length; index++){
           System.out.println(sorted.get(index).getName());
        }


    }
}
