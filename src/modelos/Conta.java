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
        System.out.println("Depositado com sucesso");
    }
    
    public void Sacar(float valor){
        if(valor > this.saldo){
            System.out.println("Erro: Valor indisponivel");
        }else{
            saldo -= valor;
            System.out.println("Valor retirado com sucesso");
        }
    }
    
    public String VerSaldo(){
        return  this.nomeConta +"Saldo = "+saldo+" R$";
    }
    
    
}
