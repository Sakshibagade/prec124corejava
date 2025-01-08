package in.prec.basicprogram.pyramid;

public class Pyramids {

    int limit;

    public Pyramids() {}

    public Pyramids(int limit) {
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void printPyramid() {
        int number = 1;
        char ch='A';
        // printing rows
        for (int row = 1; row <= limit; row++) {
            // printing spaces
            for (int space = 1; space <= limit - row; space++) {
                System.out.print("\t");
            }
            // printing numbers
           for (int col = 1; col <= row; col++) {
                //System.out.print(number++ + " ");
                //System.out.println("\n");
                
               // System.out.print((row%2==0)?(ch++ +"\t \t"):(number++ +"\t \t"));
           
        	   for(col=1;col<=row*2-1;col++)
            	
            	if(row%2==0)
            		if(col%2==0)
            			System.out.print(number++ + "\t");
            		else
            			System.out.print(ch++ + "\t");
            	else
            		if(col%2==0)
            			System.out.print(ch++ + "\t");
            		else
            			System.out.print(number++ + "\t");
            }
            // moving to the next line
            System.out.println();
        }
    }

    
}
