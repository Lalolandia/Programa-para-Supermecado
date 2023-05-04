package com.mycompany.quizz_3;

import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Quizz_3 {
    
    public static Scanner obj = new Scanner (System.in);
    
    public static void Menu (){
        System.out.println("(1)Inicie el programa");
        System.out.println("(2)Salir");
    }
    
   public static int [] VectorPrec(int precio) {
   
       
       int [] Total= new int [precio];
        
        for (int i = 0; i < precio; i++) {
            System.out.println("Digite el precio del Producto "+i+": ");
            Total [i]  = obj.nextInt();
   }
        return Total;
   }
    
   public static int Costototal (int [] Total){
       int costoT = 0;
       for (int i = 0; i < Total.length; i++){
           costoT += Total[i];
           
       }
        return costoT;
  
   }
   
   public static int Artmas(int [] precio ){
   
       int mayor = precio[0];
        for (int i =0; i<precio.length; i++){
            
            if(precio[i]> mayor){
                mayor=precio[i];
            }
        }
 
        return mayor;
     
   }
   public static String[] Artmenos(int [] precio, String Tipo [] ){
   
       for (int i = 0; i < precio.length; i++) {
            for (int j = 0; j < precio.length-i-1; j++) {
                if(precio[j] < precio[j+1]){
                    int tmp = precio[j+1];
                    precio[j+1] = precio[j];
                    precio[j] = tmp;

                    String tmpTipo = Tipo[j+1];
                    Tipo[j+1] = Tipo[j];
                    Tipo[j] = tmpTipo;
                }
            }
       }
                    return Tipo;
   }
   public String[] TipoArti(Scanner obj, int Cant){
       
       String Tipo[] = new String[Cant];
       
       for (int i = 0; i < Cant; i++) {
       System.out.println("Digite el Tipo de Producto: ");
       Tipo[i] = obj.next();
       
       
       }
        return Tipo;
   }
   public static void main(String[] args) {
       int op; 
      
       
       Menu();
        op = obj.nextInt();
        if (op == 1){
       int cantidad;
       System.out.println("Digite la cantida de articulos ");
       cantidad = obj.nextInt();
       int [] Vcant = VectorPrec(cantidad);
       
       
       String Tipo[] = new String[cantidad];
       
       for (int i = 0; i < cantidad; i++) {
       System.out.println("Digite el Tipo de Producto"+i+": ");
       Tipo[i] = obj.next();
       
       }
          String TipoAux [] = Artmenos(Vcant, Tipo);
            int i = 0; 
        System.out.println("El Tipo de Producto mas caro es: "+ TipoAux[i] );
        
        System.out.println("El Tipo de Produto mas barato es "+TipoAux[TipoAux.length-1] );
        System.out.println("El costo Total es: "+Costototal(Vcant));
        }else if (op ==2) {
            Menu();
       }
        {
}
}
}