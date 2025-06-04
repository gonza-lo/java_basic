//escoje una opcion y un numero del cual quieres generar ya sea:
//1 suma, 2 resta, 3 multiplicacion, 4 dicisiono 5 todos 
//el programa termina una vez que ingreces el numero 6

import java.util.Scanner;
public class generar_tablas_de_aritmetica {

    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       B cn=new B ();
       int op,num;
        System.out.println("TABLA ATRITMETICA");
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicacion");
        System.out.println("4 dicision ");
        System.out.println("5 todos");
        System.out.println("6 salir ");
        
        do{System.out.println("elija una opcion ");
        op=read.nextInt();
            System.out.println("de que numero");
            num=read.nextInt();
            cn.aritmetica(op,num);
            
        }
        while (op!=6);
        //final del metodo main
    }
    
}//finzal de la clase
class B extends A {
    public void aritmetica(int a, int num){
        switch(a){
            case 1: System.out.println("tabla de la suma ");
            super.suma(num); break;
            case 2: System.out.println("tabla de la resta ");
            super.resta(num); break;
            case 3: System.out.println("tabla de la multiplicacion ");
            super.multiplicacion(num); break;
            case 4: System.out.println("tabla de la division ");
            super.division(num); break;
            
        }
    }
}
class A {
    public void suma(int num){
        for(int i=1; i<11;i++){
            for(int j=num; j<=num;j++)
            System.out.print(j+"+"+i+"="+(j+1)+"\t");
            
            System.out.println("");
        }
        System.out.println("");
    }
    public void resta(int num){
        int k=1;
        for(int i=1; i<11;i++){
            for(int j=1; j<11;j++){
            System.out.print(k+"-"+j+"="+(k-1)+"\t");
            k++;
            }
            System.out.println("");
            k=k-9;
        }
        System.out.println("");
    }
    public void multiplicacion(int num){
        for(int i=1; i<11;i++){
            for(int j=num; j<=num;j++)
            System.out.print(j+"*"+i+"="+(j*1)+"\t");
            
            System.out.println("");
        }
        System.out.println("");
    }
    public void division(int num){
        int d=1;
        for(int i=1; i<10;i++){
            for(int j=1; j<10;j++){
            System.out.print(d+"/"+j+"="+(d/j)+"\t");
            d++;
            }
            System.out.println("");
            d=d/9;
        }
        System.out.println("");
    }
}