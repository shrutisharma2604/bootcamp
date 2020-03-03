package com.example.demo;
public class DemoService implements ExecuteService{
   public void createDemo(){
       System.out.println("Demo created");
   }
   @Override
   public void PrimaryEx()
   {
       System.out.println("showing primary annotation");
   }
}
