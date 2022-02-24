public class Problem10{ 
    //took help from javatpoint.com for understanding logic 
    public static void main(String args[]){  
    int original[][]={{79,28,89},{2,4,5},{8,784,29}};
    int transpose[][]=new int[3][3];
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    transpose[i][j]=original[j][i];  
    }    
    }    
      
    System.out.println("Printing Matrix without transpose:");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    System.out.print(original[i][j]+" ");    
    }    
    System.out.println();  
    }    
    System.out.println("Printing Matrix After Transpose:");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    System.out.print(transpose[i][j]+" ");    
    }    
    System.out.println();   
    }    
    }}  