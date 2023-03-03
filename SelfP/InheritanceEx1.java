

class InheritanceEx1
{
    public static void main(String[] args) {
        Child c1 =new Child();
        c1.m1();        
    }
}




class Parent{
    void m1()
    {
        System.out.println("inside M1 Parent");
    }
}
class Child extends Parent
{
	/*
    void m1()
    {
        System.out.println("inside m1 Child Class.");
    }
*/
}
