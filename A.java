//Author: jagathratchagan.p
//Title: constructor with inheritance
//date: 23/08/2022


class A
  {
   int i;
   String S,k;
   char c;
  A()
   {
   }
 class A1
 {
   String studentname;
 }
 A(String S)
 {
  super();
  this.S=S;
  System.out.println("Name:"+S);
 }
 class A2 extends A1
 {
   int studentregno;
   String studentdep;
 }
  A(int i,String k)
  {
   this('A');
   this.i=i;
   this.k=k;
   System.out.println("Reg no:"+i);
   System.out.println("dep:"+k);
  }
  class A3 extends A2
  {
   char studentrank;
  }
  A(char c)
   {
    this.c=c;
    System.out.println("rank:"+c);
   } 
 static
  {
    System.out.println("from SIB");
  }
 public static void main(String[]args)
  {
   System.out.println("from SIB1");
   A obj=new A();
   A obj1=new A("sermakani");
   A obj2=new A(1001,"CSE");
   }
 static
  {
    System.out.println("from SIB2");
  }
  {
    System.out.println("from IIB1");
  }
  {
    System.out.println("from IIB2");
  }
 }
  