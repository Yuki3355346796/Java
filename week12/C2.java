package ex91;

public class C2 {
    public static void main(String[]args){C1 c1 =new C1();
        System.out.println(c1.x);//Can accessSystem.out.println(c1.y);//Can access//System.out.println(c1.z);//Cannot access
        c1.m1();  //Can inoke this method
        c1.m2();//Can invoke this method
        //c1.m3();//cannot invoke this method
    }

}
