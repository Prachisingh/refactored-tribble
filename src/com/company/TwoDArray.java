package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by agangwar on 9/3/18.
 */
public class TwoDArray {

    private static final int MAX_GRID_WIDTH_INDEX = 6;
    private static final int MIN_GRID_WIDTH_INDEX = -2;

    private static List<Integer> listOfSymAtReel0 = new ArrayList<>();
    private static List<Integer> targetList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("name-p");
       // Thread t1 = new Thread(g,"Thread1");
        Thread t2 = new Thread(g,"Thread2");
       // g.setMaxPriority(3);
        Thread t3 = new Thread(g,"Thread3");
        Thread t[] = new Thread[10];
        g.getParent().enumerate(t);
        for (Thread t1 : t ) {
            System.out.println(t1.getPriority());
            
        }
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());

        ThreadGroup g1 = new ThreadGroup(g,"second-group");
       // System.out.println(g1.getParent().getName());
        g1.list();
      //  System.out.println(g1.activeCount());


        listOfSymAtReel0.add(1);
        listOfSymAtReel0.add(2);
        listOfSymAtReel0.add(3);


//        System.out.println(getRewindSym());
        //System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
    static int getRewindSym(){
        int rewindSym=0;
        Collections.shuffle(targetList);
        for(int i =0;i<targetList.size();i++){
            if (!(listOfSymAtReel0.contains(targetList.get(i)))) {
                rewindSym = targetList.get(i);
                break;
            }
            else{
                System.out.println("Not found");
            }
        }
        return rewindSym;

    }

    static boolean isOverlayPosAvailable(List<String[]> usedPos, String[] randomPos) {
        boolean result = true;
        for (String[] s : usedPos) {
            if (Arrays.equals(s, randomPos)) {

                System.out.println(" values are equal");
                return false;
            }
        }

        return result;
    }

    static  List<Integer> removeOutOfBoundryElements(List<Integer> overlappedWilds) {
        try{
        return overlappedWilds.stream().
                filter(i -> i > MIN_GRID_WIDTH_INDEX && i <MAX_GRID_WIDTH_INDEX).
               collect(Collectors.toList());
    }
    catch (Exception e){
        return overlappedWilds;

    }
    }


    static  int test() {
        try{
            return 1;
        }
        catch (Exception e){
            return 2;

        }
        finally {
            return 3;
        }
    }

}
