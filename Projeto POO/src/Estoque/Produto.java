package Estoque;

public class Produto {
    Produto prox;
    Produto ante;
    int Quantidade;
    String Nome;
    String Tipo;
    double PreçoCompra;
    double PreçoVenda;
    double PorcentagemVenda = 0.15;
    int diaVencimento = 0;
    int mesVencimento = 0;
    int anoVencimento = 0;
    
    public Produto(String tipo,String nome,double preçoCompra,int quantidade){
        this.prox = null;
        this.ante = null;
        this.Quantidade = quantidade;
        this.Tipo = tipo;   
        this.Nome = nome;
        this.PreçoCompra = preçoCompra;     
        this.PreçoVenda = preçoCompra*(1+this.PorcentagemVenda);
        
    }
}