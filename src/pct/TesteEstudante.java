/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author usaze
 */
public class TesteEstudante {
    public static void main (String[]args){
    
        Estudante aluno1 = new Estudante ("Uelder", 345, 'B', 0, false);
        
        
        
      /*
        aluno1.nome = "Uelder";
        aluno1.ra = 345;
        aluno1.nota = 'B';
        aluno1.freq = 0;
        aluno1.matTrancada = false;
        */
        
        //Exibindo o Estudante
        System.out.println("\n\t\t\t -- Estudante com matricula Ativa--");
        aluno1.apresentarEstudante();   
        
        //Incrementando a frequência do Estudante
        for(double i = 0; i<=100; i+= 1.25)
            aluno1.responderChamada();
        
        //Exibindo a frequência do Estudante com matricula ATIVA
        System.out.println("\n\t\t\t -- Estudante com matricula Ativa--");
        aluno1.apresentarEstudante();   
        
        
    }
}
