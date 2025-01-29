/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Voice voice = new Voice();
	    voice .prepareVoice();
	    voice.hear();
	    
	}
}

class Voice{
    
     Animal[] animal = new Animal[5];
     void prepareVoice(){
         animal[0] = new Cow();
         animal[1] = new Dog();
         animal[2] = new Goat();
         animal[3] = new Lion();
         animal[4] = new Pig();
         
     }
      void hear(){
          for(int i=0;i<5;i++)
              animal[i].makeVoice();
              
          
      }
}
  
  abstract class Animal{
   abstract void makeVoice();
    
    
}
  class Cow extends Animal{
    void makeVoice(){
        System.out.println("voice of cow");
    }
}
 
 class Dog extends Animal{
    void makeVoice(){
        System.out.println("Bark");
    }
}
 
 class Goat extends Animal{
    void makeVoice(){
        System.out.println("voice of goat");
    }
}
  class Lion extends Animal{
    void makeVoice(){
        System.out.println("Roar");
    }
}
  class Pig extends Animal{
    void makeVoice(){
        System.out.println("voice of pig");
    }
}