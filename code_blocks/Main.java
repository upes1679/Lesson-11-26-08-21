package com.code_blocks;

public class Main {
    //Static block is a special member of a class.
    //It is implicitly invoked just after a class is loaded in the memory
    //and it can be used to initialize static data members of a class.
    //You can have multiple static blocks in a single class.
    static{
        System.out.println("main static block");
    }

    public static void main(String[] args){
        //Person p=new Person();
        //Person p2=new Person(2);
       // p.checkAge(17);
    }
}
