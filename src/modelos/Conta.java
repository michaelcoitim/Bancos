/*
 * Conta do banco onde terá as pricipais operações. 
 */
package modelos;

/**
 *
 * @author Michael Coitim
 */
public class Conta {
    float saldo;
    String nomeConta;
    
    public Conta (String nomeConta){
        saldo = 0;
        this.nomeConta =nomeConta;
    }
    
    public void Depositar(float deposito){
        saldo += deposito;
    }
}
