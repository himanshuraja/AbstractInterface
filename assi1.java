abstract class number{
public int num=4;
abstract void value();
abstract void square();
}
class assi1 extends number {
void value(){
System.out.println(num);}
void square(){
System.out.println(num*num);}
public static void main(String args[]){
number obj=new assi1();
obj.value();
obj.square();}}
