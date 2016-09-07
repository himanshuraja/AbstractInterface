public interface shape{
int a=5;
int b=5;
int c=5;
 //void draw(String name);
 void getarea();
}
class interface1 implements shape{
public void getarea(){
int a=5;
int b=5;
int c=5;
System.out.println(a*b*c);}
public static void main(String args[]){
interface1 obj=new interface1();
obj.getarea();
}
}

