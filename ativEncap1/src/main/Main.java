package main;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.setNome("Leo");
        p.setIdade(20);
        p.setPais("Brasil");
        
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getPais());
        
        p.setNome("Maria");
        p.setIdade(25);
        p.setPais("Brasil");
        
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getPais());
    }
}