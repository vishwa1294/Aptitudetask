class AlphabetV{
public static void main(String[]args){
int i,j,n=3;
int p =0;
int q = 6;
for(i=0; i<=n; i++){
for(j=0; j<=6; j++){
if (i==j)
System.out.print("*"+ " ");
else if (i==p && j==q){
System.out.print("*"+ "  ");
p=p+1;
q=q-1;
}
else
System.out.print("  ");
}
System.out.println();
}
}
}

