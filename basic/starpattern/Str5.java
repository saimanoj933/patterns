class Str5{
public static void main(String args[]){
int row = 3;
int str = 3;
int spc = 0;
for(int i=1;i<=row;i++){
for(int j=1;j<=spc;j++){
System.out.print("  ");
}
for(int j=1;j<=str;j++){
System.out.print("* ");
}
System.out.println();
str--;
spc++;
}
}
}