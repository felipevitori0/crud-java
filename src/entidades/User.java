package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String nome, email;
    private int id, idade;

    public User(){

    }

    public User(String nome, String email, int id, int idade) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.idade = idade;
    }

    ArrayList<User> user = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrarUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuário");
        nome = sc.next();
        sc.nextLine();
        System.out.println("Digite o email do usuário");
        email = sc.next();
        sc.nextLine();
        System.out.println("Digite o id do usuário");
        id = sc.nextInt();
        System.out.println("Digite a idade do usuário");
        idade = sc.nextInt();

        user.add(new User(nome, email, id, idade));
        System.out.println("User cadastrado com SUCESSO!");




        
    }

    public void atualizarUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do usuário que deseja atualizar: ");
        int idbusca = sc.nextInt();

        for (User user2 : user) {
            if (getId() == idbusca) {
         System.out.println("Digite o nome do usuário");
        setNome(sc.next());
        sc.nextLine();
        System.out.println("Digite o email do usuário");
        setEmail(sc.next());
        sc.nextLine();
        System.out.println("Digite a idade do usuário");
        setIdade(sc.nextInt());;
            } else {
                System.out.println("Não encontrado !");
            }
            
        }


    }

    public void removerUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do usuário que deseja remover..");
        int idbusca = sc.nextInt();

        for (User user2 : user) {
            if (getId() == idbusca) {
                user.remove(user2);
                System.out.println("usuário removido");
                return;
            }
            System.out.println("Usuario não encontrado");
            
        }




    }

    public void listarUser(){

        System.out.println("Lista de usuários:");
        for (User users : user) {
            System.out.println("-- " + getNome() + "--" + getEmail());
            
        }
    

    }

}
