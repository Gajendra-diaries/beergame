public class BeerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=99;
        while(a>0){
        if(a>0){
            System.out.println(a +" bottles of beer on the wall,"+ a
                + " bottles of beer.");
        
            a=a-1;
            if(a>1){
            System.out.println("Take one down and pass it around," + a 
                + "bottles of beer on the wall.");}
                
            else{
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");   
            System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                    }
        
    
            }
        }
    }
}
    
