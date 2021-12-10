package com.chenxc.cxcboki;

import java.util.ArrayList;
import java.util.List;

public class StudyLamda {

    public static void main(String[] args) {
        StudyLamda studyLamda = new StudyLamda();
        //study.sort();
        new Thread(() -> System.out.println("名字" + Thread.currentThread().getName() + "子线程")).start();
    }

    public void list() {
        List<String> lamdmList = new ArrayList<>();
        lamdmList.add("xx");
        lamdmList.add("cc");
        lamdmList.add("vv");
        lamdmList.forEach(o -> {
            System.out.println(o);
        });
    }

    public void sort() {
        List<Integer> lamdmList = new ArrayList<>();
        lamdmList.add(18);
        lamdmList.add(9);
        lamdmList.add(66);
        lamdmList.add(44);
        lamdmList.sort((o1, o2) -> o1 - o2);
        lamdmList.forEach(integer -> {
            System.out.println(integer);
        });

    }
}
