package Ornek;

public class Main {

	public static void main(String[] args) {
//        System.out.println(Ata.a);
//      System.out.println(Yavru.b);
//      System.out.println(Torun.c);
//      new Ata();
//      new Yavru();
//      new Torun();
//      new Torun();
      System.out.println(Ata.a);
      System.out.println(Yavru.b);
      System.out.println(Torun.c);    
 }
  
}

class Ata{
  static{
      System.out.println("Ata sınıf initialize ediliyor");
  }
  
  {
      System.out.println("Ata sınıftan nesne türetildi");
  }
  
  static int a=3;
  private static A a1=new A();
  private B b1=new B();
  
  Ata(){
      System.out.println("Ata sınıftayız");
  }
  
  public static final C c1=new C();
}

class Yavru extends Ata{
  static{
      System.out.println("Yavru sınıf initialize ediliyor");
  }
  
  {
      System.out.println("Yavru sınıftan nesne türetildi");
  }
  
  static int b=5;
  private static D d1=new D();
  private E e1=new E();
  
  Yavru(){
      System.out.println("Yavru sınıftayız");
  }
  
}

class Torun extends Yavru{
  static{
      System.out.println("Torun sınıf initialize ediliyor");
  }
  
  {
      System.out.println("Torun sınıftan nesne türetildi");
  }
  
  static int c=7;
  private static E e2=new E();
  
  Torun(){
      System.out.println("Torun sınıftayız");
  }
}

class A{
  B b2=new B();
  
  A(){
      System.out.println("A sınıftayız");
  }
}
class D{
  D(){
      System.out.println("D sınıftayız");
  }
}

class E{
  B b2=new B();
  
  E(){
      System.out.println("E sınıftayız");
  }
}

class B{
  static{
      System.out.println("B sınıfının static bloğu");
  }
  
  B(){
      System.out.println("B sınıftayız");
  }
}

class C{
  static{
      System.out.println("C sınıfının static bloğu");
  }
  
  C(){
      System.out.println("C sınıftayız");
  }
}

