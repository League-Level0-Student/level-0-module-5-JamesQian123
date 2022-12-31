package _02_nested_loops._3_for_loop_gauntlet;

public class Gauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<101; i++) {
			System.out.println(i);
	}
		for(int j = 101; j>0; j--) {
			System.out.println(j);
			
		}
		for(int k = 2; k<101; k += 2) {
			System.out.println(k);
		}
		for(int l = 1; l<100; l+=2) {
			System.out.println(l);
		}
		for(int a = 0; a<501; a++) {
			if(a%2==0) {
				System.out.println(a +" is even");
			
				
			}
			else {
				System.out.println(a + " is odd");
			}
		}
		for(int b = 0; b<778; b+=7) {
			System.out.println(b);
		}
		int birthyear = 2008;
		for(int c = 0; c<15; c++) {
			System.out.println("In "+ birthyear++ + " I was " + c );
		}
		for(int d = 0; d <3; d++) {
			for(int e = 0; e <3; e++) {
				System.out.println(d + "" + e);
			}
		}
		for(int f = 1; f<10; f++) {
			System.out.print(f);
			if(f%3== 0) {
				System.out.println();
				
			}
		}
		for(int g = 1; g<101; g++) {
			System.out.print(g);
			if(g%10==0) {
				System.out.println();
			}
		}
		for(int h = 1; h<7; h++) {
			System.out.println("*");
			for
		}
	}

}
