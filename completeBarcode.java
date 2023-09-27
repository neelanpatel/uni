static String completeBarcode(String barcodePrefix){        // length of barcode prefix checker
        if(barcodePrefix.length()!=7 && barcodePrefix.length() != 12){
            System.out.println("Invalid barcode prefix");
            return barcodePrefix;

        }
        for(int i=0; i<barcodePrefix.length();i++){     // character is a digit checker
            Character letter= barcodePrefix.charAt(i);
            if(!Character.isDigit(letter)){
                System.out.println("Invalid barcode prefix");
                return barcodePrefix;
            }        
        }
        String reverseBarcode = "";
        char [] reverse = barcodePrefix.toCharArray();
        for(int j = reverse.length-1; j>=0; j--){
            reverseBarcode = reverseBarcode + reverse[j];
        }
        System.out.println(reverseBarcode);

        int oddevenChecker = 0;
        int counter = 0;

        for(char n: reverseBarcode.toCharArray()){     // converting the string to an array
            int rar = Character.getNumericValue(n);    // converts the character in the array to an integer to allow maths
            if(oddevenChecker % 2 ==0){               // checking if the number should be multiplied by 1 or 3
                counter += rar*3;                      // even checker
                oddevenChecker +=1;
         }

         else{                                      // odd checker
            counter += rar*1;
            oddevenChecker +=1;
          }
         }


        int checkdigt = 10-(counter % 10);       // the maths required to compute the check digit 
        String checker = Integer.toString(checkdigt);  // returing the string object represent the integers value
        String otherBarcode= barcodePrefix + checker;
        return otherBarcode;



        


    
        


           //   reversing the array

        
         
    
    }  
