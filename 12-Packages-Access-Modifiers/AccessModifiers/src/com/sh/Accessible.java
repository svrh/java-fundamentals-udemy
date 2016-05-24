package com.sh;

interface Accesible { //package-private visibility
    int SOME_CONSTANT = 100; //public visibility
    public void methodA(); //public visibility
    void methodB(); //public visibility
    boolean methodC(); //public visibility
    //the methods are not visible outside the package, because the interface itself is package-private
}
