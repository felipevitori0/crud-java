package Executavel;

import java.util.Scanner;

import entidades.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        User u = new User() ;
        int op = 0;
        
        do {
            System.out.println("Escolha sua opção..");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Remover Usuário");
            System.out.println("4. Listar Usuário");
            System.out.println("0. Para finalizar");
    
             op = sc.nextInt();
             sc.nextLine();
            

            switch (op) {
                case 1:
                    u.cadastrarUser();
                    break;
                case 2:
                    u.atualizarUser();
                    break;
                case 3:
                    u.removerUser();
                    break;
                case 4:
                    u.listarUser();
                    break;
                case 0:
                    System.out.println("Finalizando..");
                    break;
            
                default:
                    break;
                }
                
            } while (op != 0);


        



sc.close();
        }
}
