package forloops.java;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=4;i>0;i--)
{
	for(int k=0;k<4-i;k++) {
		System.out.print(" ");
	}
	for(int j=0;j<i;j++) {
		System.out.print(i);
	}
	System.out.println();
}
	}

}
