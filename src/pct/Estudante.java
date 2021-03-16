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
public class Estudante {
    
    String nome;
    int ra;
    char nota;
    double freq;
    boolean matTrancada;
    
    //Métodos
    public void apresentarEstudante(){
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota: " + nota);
        System.out.println("Frequência: " + freq);
        System.out.println(matTrancada? "Matrícula Trancada":"Matrícula Ativa");
    }
    
    public void responderChamada(){
        freq ++;
      }
    
    }
    

