class pattern_new{
    public static void main(String args[]){
        int n=3;
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");  
            }
            for(int j=1; j<=2*i+1; j++){
                System.out.print("*"+" ");  
            }
            System.out.println();  
        }
        for(int i=1; i<=2; i++){
            for(int j=1; j<=7; j++){
                if(j==1||j==7){
                    System.out.print("  *");
                } 
                else{
                    System.out.print(" ");
                } 
            }
            
            System.out.println();  
        }
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");  
            }
            for(int j=1; j<=2*i+1; j++){
                System.out.print("*"+" ");  
            }
            System.out.println();  
        }
    }
}