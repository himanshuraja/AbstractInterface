abstract class instrument {
public char  name;
String s="pokemon";

abstract void play();}
class stringinstrument extends instrument{
public int numberofstrings=5;
void play(){
System.out.println(numberofstrings);
}}
class electricguitar extends stringinstrument{
void play(){
System.out.println("electricguitar");
}}
class assi2 extends electricguitar{
void play(){
System.out.println("electricbassguitar");}

public static void main(String args[]){
electricguitar as=new assi2();
stringinstrument b=new assi2();
as.play();
b.play();
assi2 n=new assi2();
n.play();

}}
