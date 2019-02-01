package Estoque;
import java.util.Scanner;
public class Produtos {  
    Scanner input = new Scanner(System.in);
    int op = 0;
    
    
    public void ExecutarAção(){
            System.out.println("Deseja adicionar um produto - [1]");
            System.out.println("Deseja listar todos os produtor - [2]");
            System.out.println("Deseja remover algum produto - [3]");
            System.out.println("Deseja alterar a porcentagem do valor de venda - [4]");
            System.out.println("Vender produto - [5]");
            op = input.nextInt();
            
            if(op == 1)
                AdicionarProdutos();
            if(op == 2)
                ListaProdutos();
            if(op == 3)
                RemoveProdutos();
            if(op == 4)
                AlteraPreços();
            if(op == 5)    
                VenderProdutos();
    }
        
    private void AdicionarProdutos(){
        String nome;
        String tipo = null;
        int quantidade = 0;
        double preçoCompra = 0;
        double preçoVenda;
        
        System.out.println("Nome do produto");
        nome=input.nextLine();
        nome=input.nextLine();
        System.out.println("Tipo do produto (higiene,vestes,banho,cama,alimentação");
        tipo = input.nextLine();
        System.out.println("Quantidade");
        quantidade = input.nextInt();
        System.out.println("Preço de entrada");
        preçoCompra = input.nextDouble();
        
     Produto item = new Produto(tipo,nome,preçoCompra,quantidade);
     
    }
    private void ListaProdutos(){
        
    }
    private void RemoveProdutos(){
        
    }
    private void AlteraPreços(){
        
    }
    private void VenderProdutos(){
        
    }
    
}
