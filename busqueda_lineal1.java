import java.util.Scanner;
public class busqueda_lineal1 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int i,n=leer.nextInt();
       int v[]=new int [n];
       for(i=0;i<n;i++){
           v[i]=1+(int)(Math.random()*10);
           System.out.print(v[i]+"\t");
       }
        System.out.println("que numero quiere encontrar?");
       int x=leer.nextInt();
       int pos=-1;
       for(i=0;i<n;i++){
           if(v[i]==x){
               pos=i;
           }
       }
       if(pos==-1){
           System.out.println("num_no_encontrado");
       }else{
           System.out.println("se encontro en la osicion: "+pos);
       }
    }
    
}
