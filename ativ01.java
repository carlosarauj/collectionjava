import javax.swing.JOptionPane;

public class ativ01 {

  public static void main(String args []) {


   String nome = "Carlos";
   String sobrenome = "Araújo";
   String nomeCompleto = nome + sobrenome;
   String nomeComBuffer;
   
   System.out.println(nome + " " + sobrenome);
   
   StringBuilder buffer = new StringBuilder();
   
   buffer.append(nome);
   buffer.append(sobrenome);
   
   nomeComBuffer = buffer.toString();
   
   System.out.println(nomeCompleto);
   System.out.println(nomeComBuffer);
   
  } 

 }