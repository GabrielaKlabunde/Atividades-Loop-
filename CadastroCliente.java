package cadastrocliente;

import modelo.Cliente;

public class CadastroCliente {

    public static void main(String[] args) {
    //dado do tipo Cliente    
        Cliente cli = new Cliente();
        
        cli.codigo = 10;
        cli.nome = "Marcos";
        cli.cpf = "08854212301";
        cli.endereco = "Av. 1° de maio"; 
        cli.cep = 88352490;
        cli.email = "marcos@gmail.com";
        cli.telefone = "33529064";
        cli.aposentado = false;
        
        //Array de clientes
        Cliente [] listaDeClientes = new Cliente[3];
        
        listaDeClientes [0] = cli;
        
        cli = new Cliente();
        cli.nome = " Jack Daniel";
        cli.cpf = "08865872369";
        listaDeClientes [1] = cli;
        
        cli = new Cliente();
        cli.nome = "Jonathan";
        cli.cpf = "08898632016";
        listaDeClientes [2] = cli;
        
        System.out.println("Funcionários da Empresa: ");
        System.out.println("");
        
        for (int i = 0; i < listaDeClientes.length; i++) {
            cli= listaDeClientes[i];
         
            System.out.println("Nome: "+cli.nome);
            System.out.println("CPF: "+cli.cpf);
            System.out.println("");
            
        }
