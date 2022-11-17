/*
 * app banco simples 
 */
package bancos;

import modelos.Conta;

/**
 *
 * @author Michael Coitim 
 */
public class Banco {

    /**
     * criando conta e utilizando seus meteodos
     */
    public static void main(String[] args) {
        Conta c1 = new Conta("Maria probre");
        Conta c2 = new Conta("Maria Rica");
        
        System.out.println(c1.VerSaldo());
        
        c2.Depositar(10000);
        c1.Depositar(100);
        c2.Sacar(100);
        c1.Sacar(200);
        
        System.out.println(c1.VerSaldo());
        System.out.println(c2.VerSaldo());


        
        
    }

}
