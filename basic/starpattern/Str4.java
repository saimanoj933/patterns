class Str4{
public static void main(String args[]){
int row = 3;
int str = 1;
int spc = 2;
for(int i=1;i<=row;i++){
for(int j=1;j<=spc;j++){
System.out.print("  ");
}
for(int j=1;j<=str;j++){
System.out.print("* ");
}
System.out.println();
str++;
spc--;
}
}
}