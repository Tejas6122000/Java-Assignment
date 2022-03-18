

public class q1 {
    public static void main(String args[]) {
       Animal Monkey = new Monkey();
       Monkey.eat();
       Monkey.sleep();
       Terrestrials Orangotan = new Orangotan();
       Orangotan.eat();
       Orangotan.sleep();
    }
 }
 interface Animal {
    public void eat();
    public void sleep();
 }
 class Monkey implements Animal {
    public void eat(){
       System.out.println("Monkey eats");
    }
    public void sleep(){
       System.out.println("Monkey sleeps");
    }
 
 }
 abstract class Terrestrials {
 abstract public void eat();
 public void sleep()
 {
     System.out.println("Terrestrials sleeps");
 }
 }
 
 class Orangotan extends Terrestrials{
    public void eat(){
       System.out.println("Orangotan eats");
    }
 }