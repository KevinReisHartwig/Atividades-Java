
package javaapplication1;

public class RoberNum {
    
    public static void main(String[] args){
        int num,d,a,b,c;
        System.out.println("o numero inteiro informado de 4 digitos é 2459");
        num=2459;
        d=num/1000;
        a=(num/100)%10;
        b=(num/100)/10;
        c=(num%100)%10;
        System.out.println("Resultado: a= " + a);
        System.out.println("d= " + d );
        System.out.println("c= "+c );
        System.out.println("b= " + b );
    }
    
}
