package main;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1, "Ana", 3500.50);
        
        System.out.println(f1.getId());
        System.out.println(f1.getNome());
        System.out.println(f1.getSal());
        
        f1.setId(2);
        f1.setNome("Bia");
        
        System.out.println(f1.getId());
        System.out.println(f1.getNome());
        System.out.println(f1.getSal());
    }
}