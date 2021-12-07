
package rpg;

import java.util.Scanner;

public class RPG {


    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        int guc=5;
        int Strenght=0;
           int Defense=0;
           String S="strenght";
           String D="defense";
           
          int statpuan;
                   
                                           
           System.out.println("Select a stat to improve");
           System.out.println(">>---------------------------------------<<");
           System.out.println("Strenght,Defense");
          
           
           
           String statgirilen=k.nextLine();
                     
           
           System.out.println("How much point do you want to improve "+statgirilen+"?");
           System.out.println("You Have 5 points.");
           statpuan=k.nextInt();                    
           
           
           if(statgirilen.equals(S)) {
               Strenght=statpuan;              
               
           }
           else {
               Defense=statpuan;
               
           }
           
       
       
        System.out.println("Give a name to the Character:");
        
        Scanner c=new Scanner(System.in);
        String cname=c.nextLine(); 
        
        
        
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        
        //---------------------------------------
        Scanner a=new Scanner(System.in);
        int guc1=5;
        int Strenght1=0;
           int Defense1=0;
           String S1="strenght";
           String D1="defense";
           
          int statpuan1;
                   
                                           
           System.out.println("Select a stat to improve");
           System.out.println(">>---------------------------------------<<");
           System.out.println("Strenght,Defense");
          
           
           
           String statgirilen1=a.nextLine();
                     
           
           System.out.println("How much point do you want to improve "+statgirilen1+"?");
           System.out.println("You Have 5 points.");
           statpuan1=a.nextInt();                    
           
           
           if(statgirilen1.equals(S1)) {
               Strenght1=statpuan1;              
               
           }
           else if(statgirilen1.equals(D1)) {
               Defense1=statpuan1;
               
           }
           
       
       
        System.out.println("Give a name to the Character:");
        
        Scanner c1=new Scanner(System.in);
        String cname1=c1.nextLine(); 
        
        
        
        System.out.println("\n");
        System.out.println("\n");
        
        System.out.println(cname+"`s stats:");
        System.out.println("Strenght: "+Strenght);
        System.out.println("Defense: "+Defense);
        int oyuncu1can=100;
        int oyuncu1guc=20;
        System.out.println("-------------------------");
        
        
        System.out.println(cname1+"`s stats:");
        System.out.println("Strenght: "+Strenght1);
        System.out.println("Defense: "+Defense1);
        int oyuncu2can=100;
        int oyuncu2guc=20;
       
        
        
        //p1 başlangıç----------------------------------------------------------------<
        
        int sayac=2;
        
        p1:
        while(oyuncu1can>0){
            
                
          
          
                    
        System.out.println("\n");
        System.out.println("\n");
        
        
        System.out.println("Roll a Dice");
      String giris=k.nextLine();
       
      int zar=(int)(Math.random()*20);
      int oyuncu1;
      oyuncu1=zar;
        
     
      
       
      int zar1=(int)(Math.random()*20);
      int oyuncu2;
      oyuncu2=zar1; 
       
     System.out.println(cname+" rolls "+zar);
     System.out.println(cname1+" rolls "+zar1);
                    
     
     
                           
     
                          while(sayac%2==0){                                   //BURDA SAYAC VAR-----------------------
                System.out.println(cname+" attacks!");
                                                                                   //Oyuncu 1 saldırırken -----------------------------------------
                while(zar>=zar1){
                    int sira=0;
                    if(zar>17){
                        
                        System.out.println("its a critical attack!");
                        oyuncu2can=(oyuncu2can+Defense1)-(oyuncu1guc*2+Strenght);
                        sira++;
                        if(sira==1){
              System.out.println(cname1+"`s healt: "+oyuncu2can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                    sayac++;
                            
                    if(oyuncu2can<=0){
                        System.out.println(cname+" wins!");
                        break;
                    }
                    
                    
                    continue p1;
              
          }
                    }
                    else{
                        
                        oyuncu2can=(oyuncu2can+Defense1)-(oyuncu1guc+Strenght);
                        sira++;
                        if(sira==1){
              System.out.println(cname1+"`s healt: "+oyuncu2can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                           sayac++;
                    
                            if(oyuncu2can<=0){
                        System.out.println(cname+" wins!");
                        break;
                    }
                           
                           continue p1;
          }
                    }
                    
                    
                }
                while(zar<zar1){
                    sayac++;
                    int sira=0;
                    System.out.println(cname1+" defends and not taking any damage!");
                    sira++;
                    if(sira==1){
              System.out.println(cname1+"`s healt: "+oyuncu2can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                        continue p1; 
                        
          
                    }   
                }
            }
                          
                      //-------------------------------------------- ----------------------------------------------------p2 haraket kısmı
                          while(sayac%2==1)
                          {
                              int sira=0;
                              System.out.println(cname1+" attacks!");
                              while(zar1>=zar){
                    if(zar1>17){
                        
                        
                        System.out.println("its a critical attack!");
                        oyuncu1can=(oyuncu1can+Defense)-(oyuncu2guc*2+Strenght1);
                        sira++;
                        if(sira==1){
              System.out.println(cname+"`s healt: "+oyuncu1can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                    sayac++;
                           
                     if(oyuncu1can<=0){
                        System.out.println(cname1+" wins!");
                        break;
                    }
                    
                    
                    continue p1;
              
          }
                    }
                    else{
                        oyuncu1can=(oyuncu1can+Defense)-(oyuncu2guc+Strenght1);
                        sira++;
                        if(sira==1){
              System.out.println(cname+"`s healt: "+oyuncu1can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                           sayac++;
                    
                           if(oyuncu1can<=0){
                        System.out.println(cname1+" wins!");
                        break;
                    }
                           
                           continue p1;
          }
                    }
                    
                    
                }
                while(zar1<zar){
                   sayac++; 
                    System.out.println(cname+" defends and not taking any damage!");
                    sira++;
                    if(sira==1){
              System.out.println(cname+"`s healt: "+oyuncu1can);
                    zar=zar-zar;
                    zar1=zar1-zar1;
                        continue p1;
          
                    }   
                }
                              
                              
                          }
          
            
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
        
     
     
            }
            
        }
        
    
    }
    

