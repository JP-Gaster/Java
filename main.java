class Filmes {
  public static void main(String[] args) {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Transsformers: O Início");
    
    int ano = 2024;
    boolean incluindo_no_plano = true;
    double nota_filme = 4.9;
    
    System.out.println("Ano de lançamento " + ano);
    
    double media = (4.9 + 4.0)/2;
    System.out.println("A média das notas deste filme é:" +media);
    
    String sinopse;
    sinopse = "A história que nunca antes havia sido contada. A origem de Optimus Prime e Megatron, duas figuras lendárias que em sua juventude foram irmãos de armas, lutando juntos pelo futuro de seu planeta natal, Cybertron.";
    System.out.println(sinopse);
  }
}
