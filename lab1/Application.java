/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother {
    int x = 10; 
   
    
    void show() {
        System.out.println("This is the show method of Mother class. Value of x: " + x);
    }
}


class Child extends Mother {
    

}
public class Application {
    public static void main(String[] args) {

        Mother m = new Mother();
        m.show(); 

        
        Child ch = new Child();
        ch.show(); 
    }
}

