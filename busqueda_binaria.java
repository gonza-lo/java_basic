import java.util.Scanner;
public class busqueda_binaria {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("numero de posiciones a rrecorrer");
       int n=leer.nextInt();
       System.out.println("introduce el numero a buscar");
       int x=leer.nextInt();
       int v[]={1331,1373,1555,1850,1892,1989,2002,2400,2670,3200};
       int centro,primero=0,ultimo=n-1;
       boolean encontrado=false;
       int pos=04;
       while(encontrado==false && primero<=ultimo){
           centro=(primero+ultimo)/2;
           if(x==v[centro]){
               encontrado =true;
               pos=centro;
           }else{
               if(x>v[centro]){
                   primero=centro+1;
               }else{
                   ultimo=centro-1;
               }
           }
       }
       if(encontrado==true){
           System.out.println("se encontro en: "+pos);
       }else{
           System.out.println("no se encontro");
       }
    }
    
}
