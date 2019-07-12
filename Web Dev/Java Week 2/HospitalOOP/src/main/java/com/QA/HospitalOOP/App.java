package com.QA.HospitalOOP;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Hospital NHS = new Hospital();
    	
    	
    	Ward abc = new Ward("Test", 5);
    	
    	
    	
    	Patient bee = new Patient("bee", 34);
    	Patient Dave1 = new Patient("Davs", 34);
    	Patient Dave2 = new Patient("Davs", 34);
    	Patient Dave3 = new Patient("Davs", 34);
    	Patient Dave4 = new Patient("Davs", 34);
    	Patient DaveS = new Patient("fdgsayrtqa56", 34);
    	
    	abc.addPatient(bee);
    
   
    	
    	
        System.out.println(bee);
        System.out.println(DaveS);
        System.out.println(abc);
        
        NHS.createPatient("Test me", 14, abc);
        
    }
}
