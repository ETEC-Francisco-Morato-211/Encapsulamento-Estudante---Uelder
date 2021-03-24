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
    
   private String nome;
   private int ra;
   private char nota;
   private double freq;
   private boolean matTrancada;
    
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }
   public void setRa(int ra){
       this.ra = ra;
   }
   public int getRa(){
       return ra;
   }
   public void setNota(char nota){
       this.nota = nota;
   }
   public char getNota(){
       return nota;
   }
   public void setFreq(double freq){
       this.freq = freq;
   }
   public double getFreq(){
       return freq;
   }
   public void setMatTrancada(boolean matTrancada){
       this.matTrancada = matTrancada;
   }
   public boolean getMatTrancada(){
       return matTrancada;
   }

    public Estudante(String nome, int ra, char nota, double freq, boolean matTrancada) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.freq = freq;
        this.matTrancada = matTrancada;
    }

    public boolean isMatTrancada() {
        return matTrancada;
    }

   

   
   
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
    

