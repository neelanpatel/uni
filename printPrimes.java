static void printPrimes(int max){
        for( int num=2; num <= max; num++){
            boolean Prime = true; 
            for(int f=2; f<=num/2; f++){
                if(num%f==0){
                    Prime=false;
                }
            }
                if (Prime){
                System.out.println(num);
                }


        

        }
    }
