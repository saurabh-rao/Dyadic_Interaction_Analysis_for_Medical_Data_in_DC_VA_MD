/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohit
 */
public class MedicalDataProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DataProcessor dp = new DataProcessor();
        
        dp.readData("/Users/Rohit/Downloads/final_csv.csv");
        dp.writeData("/Users/Rohit/Downloads/final_csv_output.csv");
    }
    
}
