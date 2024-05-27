import java.util.Scanner;


public class IrmakCafe{
    public static void main(String[] args) {
        int userMoney=100;
          System.out.print("Your money:"+userMoney+"\n");
        String arrayD[]={"Coffee","Tea","Milkshake","Coke","Fanta"};
        int    arrayDC[]={100,40,80,30,30};
        String arrayF[]={"Sandwich","French Fries","Kumpir"};
        int arrayFC[]={80,70,100};
        String arrayT[]={"Magnolia","Cheesecake","Tiramisu"};
        int arrayTC[]={80,80,100};
        String elements[]={"Drink","Food","Dessert"};
        Scanner scan= new Scanner(System.in);
        int amount[]=new int[3];
  
        System.out.println("Drinks:");
        for(int i=0;i<arrayD.length;i++){
              System.out.print((i+1)+"."+arrayD[i]+"\t"+arrayDC[i]+"Tl"+"\t");  }
               System.out.println();
              System.out.println("Foods:");
       for(int i=0;i<arrayF.length;i++){
        System.out.print((i+1)+"."+arrayF[i]+"\t"+arrayFC[i]+"Tl"+"\t");
       }
       System.out.println();
       System.out.println("Desserts:");
          for(int i=0;i<arrayT.length;i++){
            System.out.print((i+1)+"."+arrayT[i]+"\t"+arrayTC[i]+"Tl"+"\t");
          }
          int count=0;
          while(count<3){
            System.out.printf("\n How many %ss do you want? \n",elements[count]);
            amount[count]=scan.nextInt();
            count++;
          }
          String arrayDchoose[]=new String[amount[0]];
          int arrayDchooseC[]=new  int[amount[0]];
          String arrayFchoose[]=new String[amount[1]];
          int arrayFchooseC[]=new int[amount[1]];
          String arrayTchoose[]=new String[amount[2]];
          int arrayTchooseC[]=new int[amount[2]];

               int option;
              for(int i=0;i<3;i++) {
                for(int j=0;j<amount[i];j++){
                  if(i==0){
                    System.out.printf("Choose your %d . drink \n",(j+1));
                      option=scan.nextInt();
                     arrayDchoose[j]=arrayD[option-1]; 
                     arrayDchooseC[j]=arrayDC[option-1];
                  }
                  if (i==1){
                    System.out.printf("Choose your %d.food \n",(j+1));
                     option=scan.nextInt();
                     arrayFchoose[j]=arrayF[option-1];
                     arrayFchooseC[j]=arrayFC[option-1];
                  }
                  if(i==2){
                    System.out.printf("Choose your %d.dessert \n",(j+1));
                    option=scan.nextInt();
                    arrayTchoose[j]=arrayT[option-1];
                    arrayTchooseC[j]=arrayTC[option-1];

              }     } 
        

    }    
                   
             int total=0;
             System.out.println("The drinks you take:");
          for( int i=0;i<amount[0];i++){
            System.out.print(arrayDchoose[i]+"\t"+arrayDchooseC[i]+"\n");
            total+=arrayDchooseC[i];}
            count++;
            System.out.println("The foods you take:");
            for(int  i=0;i<amount[1];i++){
              System.out.print(arrayFchoose[i]+"\t"+arrayFchooseC[i]+"\n");
            total+=arrayFchooseC[i];}
            System.out.println("The desserts you take:");
            for(  int i=0;i<amount[2];i++){
              System.out.print(arrayTchoose[i]+"\t"+arrayTchooseC[i]+"\n");
            total+=arrayTchooseC[i]; }

          System.out.print("Total Cost:"+ total);
           if(total>userMoney){
               System.out.print("\n"+(total-userMoney)+"\t" +"less than order cost ,Load money:");
               userMoney=addMoney(userMoney);
               System.out.print("Your Money:"+userMoney+"\n");
               System.out.print("\n"+"Money is loaded please order again.");

           } 
           else{
                userMoney=pay(total,userMoney);
                System.out.print( "\n"+"Your Money:"+userMoney+"\n");
                System.out.print("\n"+"Your order has taken.");
            

           }
           
           scan.close();
          

}
   static int addMoney(int userMoney){
       Scanner scanMoney=new Scanner(System.in);
       int upploadMoney= scanMoney.nextInt();
       scanMoney.close();
        return(upploadMoney+userMoney);
   }
    static int  pay(int total,int userMoney){
           return(userMoney-total);
  
    }



}