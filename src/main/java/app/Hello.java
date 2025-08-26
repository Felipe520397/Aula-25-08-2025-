package app;

public class Hello {
    public static void main(String[] args) {
       Genero policial = new Genero(1,"policial");
       Genero aventura = new Genero(2,"Aventura");
       Genero terror = new Genero(3,"Terror");

       Filme f1 = new Filme();
       f1.setId(1);
       f1.setTitulo("A sociedade do anel");
       f1.setGenero(aventura);

       Filme f2 = new Filme(2,"duna", aventura);
       Filme f3 = new Filme(3,"Entre facas e Segredos", policial);

       System.out.println(f1.getTitulo());
       System.out.println(f2.getTitulo());
       System.out.println(f3.getTitulo());
       
    }
}

