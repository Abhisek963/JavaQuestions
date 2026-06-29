package patternProgram;

public class AlphaPyramid {

    public static void star(int num) {
    	int mid = num;
    	for (int i =1;i<=num;i++) {
    		char ch ='a';
    		for (int j =1;j<=2*num-1;j++) {
    			if(i+j>=num+1 && j-i<=num-1) 
    				if(j<mid)
    				System.out.print(ch++ +" ");
    				else
    					System.out.print(ch-- +" ");
    			else
    				System.out.print("  ");
    			}
    		System.out.println();
    		}
    		
    	}


    public static void main(String[] args) {
        star(4);
    }
}