// Estruture três códigos, os quais devem conter
// uma função de manipulação de string que obtenha resultado.

public class Manipulacao {
    public static void main(String[] args) {
  
      String teste = "Eu gosto de você.";
      
      System.out.println(teste);
      System.out.println(teste.substring(12)); // obter parte de uma string (inicio)
      System.out.println(teste.substring(12,16)); // obter parte de uma string (inicio,fim)(inicio)
  
      String bom = "Bom";
      String dia= " dia!";
      String bomDia = bom.concat(dia); //unindo palavras (concatenando)
      System.out.println(bomDia);
  
      String  espacos = "m e z a"; //substituíndo caracteres (z por s)
      String semEspacos = espacos.replace('z', 's');
  
      semEspacos = semEspacos.replaceAll(" ", "");
      System.out.println(semEspacos);
  
      String nome = " qual a sua idade: "; //removendo espaços
      System.out.println(nome);
      System.out.println(nome.trim());
  
    }
    
  }