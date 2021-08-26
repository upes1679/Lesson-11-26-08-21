package com.code_blocks;

public class Person {
    private static int number;

    static {
        number=8;
        System.out.println("static ctor");
    }


    //An anonymous block in java is a special member of a class.
    //It does not have names and represents statements that are common to
    // all the constructors of the class.
    //An anonymous block is used when you want to execute some common statements before all
    // the constructors that are available in a class.
    //As you can see the statement of the anonymous block is executed before the constructor.
    //This happened because, at the time of compilation,
    //statements of the anonymous block are moved to the beginning of each constructor
    //by the compiler.
    {
        System.out.println("Anonymous code block");
    }

    public Person() {
        System.out.println("Empty ctor");
    }

    public Person(int id) {
        this();
        System.out.println("Parameterized ctor");
    }

    public void checkAge(int age) {
        namedcodeblock:
        {
            if (age < 18) {
                System.out.println("Age is under 18. Not allowed");
                break namedcodeblock;
            }

            System.out.println("Age is over 18");
        }
    }
}
